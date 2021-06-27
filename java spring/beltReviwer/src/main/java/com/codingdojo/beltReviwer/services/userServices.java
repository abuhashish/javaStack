package com.codingdojo.beltReviwer.services;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.beltReviwer.models.Event;
import com.codingdojo.beltReviwer.models.Message;
import com.codingdojo.beltReviwer.models.State;
import com.codingdojo.beltReviwer.models.User;
import com.codingdojo.beltReviwer.models.newEvent;
import com.codingdojo.beltReviwer.repositories.eventRepository;
import com.codingdojo.beltReviwer.repositories.messageRepository;
import com.codingdojo.beltReviwer.repositories.stateRepository;
import com.codingdojo.beltReviwer.repositories.userRepository;
import com.codingdojo.beltReviwer.repositories.users_eventsRepository;


@Service
public class userServices {
    private final userRepository userRepository;
    private final users_eventsRepository ueR;
    private final eventRepository ER;
    private final stateRepository SR;
    private final messageRepository Mr;
    
    public userServices(userRepository userRepository ,users_eventsRepository ueR,eventRepository ER,stateRepository SR,messageRepository Mr) {
        this.userRepository = userRepository;
        this.ueR=ueR;
        this.ER=ER;
        this.SR=SR;
        this.Mr=Mr;
    }
    
    // register user and hash their password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        
        return userRepository.save(user);
    }
    
    // find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    public User findbyid(Long id){
    	Optional<User> x = userRepository.findById(id);
    	if (x.isPresent()) {
    		return x.get();
    	} else {
    		return null;
    	}
    }
	public  void createEvent(@Valid newEvent x) {
		User user=findbyid(x.getUser_id());
		Event event=new Event();
		event.setHost(user);
		event.setName(x.getEventname());
		//check if state already exists or not
		State state=SR.findByName(x.getState()).orElse(null);
		event.setState(state);
		event.setLocation(x.getEventlocation());
		ER.save(event);
	}
	public List <Event> findByState(State x){
		return ER.findByState(x);
	}
	public List<State> findAllstates(){
		return SR.findAll();
	}

	public List<Event> findAll() {
		
		return ER.findAll();
	}
	public State newstate(@Valid State x) {
		System.out.println(x.getName());
		return SR.save(x);
	}
	public void deleteById(Long id) {
		ER.deleteById(id);
	}
	public Event findeventbyid(Long id){
    	Optional<Event> x = ER.findById(id);
    	if (x.isPresent()) {
    		return x.get();
    	} else {
    		return null;
    	}
    }

	public void joinevent(Long id,HttpSession session) {
		Event x=findeventbyid(id);
		User y=findbyid((Long)session.getAttribute("user.id"));
		List <User> test=x.getUsers();
		test.add(y);

		if(test.contains(y)) {
			System.out.println("shitty test");
		}
		x.setUsers(test);
		ER.save(x);
	}
	public void cancelevent(Long id,HttpSession session) {
		Event x=findeventbyid(id);
		User y=findbyid((Long)session.getAttribute("user.id"));
		List <User> test=x.getUsers();
		test.remove(y);
		x.setUsers(test);
		
		ER.save(x);
	}

	public void updateEvent(@Valid Event event) {
		ER.save(event);
		
	}

	public void createMessage(@Valid Message message) {
		Mr.save(message);
		
	}
	
}