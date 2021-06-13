package DLL;

public class Node {
    public Integer value;
    public Node previous;
    public Node next;
    
    public Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
    }
    boolean isPalindrome() {
    	Integer x=this.value;
    	Integer reversed = 0;

        // run loop until num becomes 0
        while(x != 0) {
        
          // get last digit from num
          int digit = x % 10;
          reversed = reversed * 10 + digit;

          // remove the last digit from num
          x /= 10;
        }
        if(x==reversed) {
        	return true;
        }
        else 
        	return false;
    }
}