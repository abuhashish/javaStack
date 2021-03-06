package com.codingdojo.beltReviwer.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date date;
	    private String location;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="state_id")
	    private State state;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User host;
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "users_events", 
	        joinColumns = @JoinColumn(name = "event_id"), 
	        inverseJoinColumns = @JoinColumn(name = "user_id")
	    )
	    private List<User> users;
	    @OneToMany(mappedBy="event", fetch = FetchType.LAZY)
	    private List<Message> messages;  
	    public Event() {
	    	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public State getState() {
			return state;
		}
		public void setState(State state) {
			this.state = state;
		}
		public User getHost() {
			return host;
		}
		public void setHost(User host) {
			this.host = host;
		}
		public List<User> getUsers() {
			return users;
		}
		public void setUsers(List<User> users) {
			this.users = users;
		}
		public List<Message> getMessages() {
			return messages;
		}
		public void setMessages(List<Message> messages) {
			this.messages = messages;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		
	    
}
