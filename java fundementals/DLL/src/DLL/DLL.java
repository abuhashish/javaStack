package DLL;

import java.util.ArrayList;

public class DLL {
	    public Node head;
	    public Node tail;
	    public static int i=0;
	    public DLL() {
	        this.head = null;
	        this.tail = null;
	    }
	    
	    // the push method will add a new node to the end of the list
	    public void push(Node newNode) {
	        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
	    	i++;
	        if(this.head == null) {
	            this.head = newNode;
	            this.tail = newNode;
	            return;
	        }
	        
	        // first find the lastNode in the list
	        // then, set the lastNode's next to be the newNode;
	        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
	        // finally, set the list's tail to be the node that we have added
	        Node lastNode = this.tail;
	        lastNode.next = newNode;
	        newNode.previous = lastNode;
	        this.tail = newNode;
	    }
	    
	    public void printValuesForward(Node head) {
	        // find the first node, aka head.
	        Node current = head;
	        
	        // while the current node exists...
	        while(current != null) {
	            // print it's value
	            System.out.println(current.value);
	            // and move on to it's next node.
	            current = current.next;
	        }
	    }
	    public void printValuesForward() {
	        // find the first node, aka head.
	        Node current = head;
	        
	        // while the current node exists...
	        while(current != null) {
	            // print it's value
	            System.out.println(current.value);
	            // and move on to it's next node.
	            current = current.next;
	        }
	    }
	    void printValuesBackward() {
	    	Node current = this.tail;
	    	while(current!=null) {
	    		System.out.println(current.value);
	    		current=current.previous;
	    	}
	    }
	    Node pop() {
	    	if (head.next == null) {
	    		return head=null;
	    	}
	    	Node current=this.tail.previous;
	    	Node temp=current.next;
	    	tail=current;
	    	current.next=null;
	    	temp.previous=null;
	    	i--;
	    	return temp;
	    }
	    boolean contains(Integer value) {
	    	Node current=this.head;
	    	while (current!=null) {
	    		if(current.value==value) {
	    			return true;
	    		}
	    		current=current.next;
	    	}
	    	return false;
	    }
	    int size() {
	    	return i;
	    }
	    void insertAt(Node newNode, int index) {
	    	Node current = this.head;
	    	for (int g=0;g<index-1;g++) {
	    		current=current.next;
	    	}
	    	Node next=current.next;
	    	current.next=newNode;
	    	next.previous=newNode;
	    	current.next.next=next;
	    	current.next.previous=current;
	    
	    }
	    void removeAt(int index) {
	    	Node current = this.head;
	    	for (int g=0;g<index-1;g++) {
	    		current=current.next;
	    	}
	    	Node x=current.next;
	    	current.next=current.next.next;
	    	current.next.next.previous=current;
	    	x.next=null;
	    	x.previous=null;
	    }
	    void removeMiddle() {
	    	Node current=this.head;
	    	int i=0;
	    	while(current.next!=null) {
	    		current=current.next;
	    		i++;
	    	}
	    	int middle=i/2;
	    	removeAt(middle);
	    }
	    Node Normalreverse() {
	    	Node prev=null;
	    	Node current=head;
	    	Node aux=current.next;
	    	while(current!=null) {
	    		current.next=prev;
	    		prev=current;
	    		current=aux;
	    		if(current!=null) {
	    			aux=aux.next;
	    		}
	    		
	    	}
	    	return prev;
	    }
	    void DLLreverse() {
	    	Node temp= head;
	    	head = tail;
	    	tail= temp;
	    	Node current=head;
	    	while(current!=null) {
	    		 temp= current.next;
	    		 current.next=current.previous;
	    		 current.previous=temp;
	    		 current=current.next;
	    	}
	    }
	    public boolean isLoop() {
	    	Node current=head;
	    	ArrayList<Node> x=new ArrayList<Node>();
	    	while(current !=null) {
	    		if(x.contains(current)) {
	    			return true;
	    		}
	    		x.add(current);
	    		current=current.next;
	    		
	    	}
	    	return false;
	    }
	    public boolean isloop() {
	    	Node current=head;
	    	Node temp=head;
	    	while(current.next!=null) {
	    		current=current.next;
	    		if(temp.next.next == null)
	    			return false;
	    		temp=temp.next.next;
	    		if(current == temp) 
	    			return true;	
	    	}
	    	return false;
	    }
	 
	}

