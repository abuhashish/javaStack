package DLL;

public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(-4);
      
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        
       
       System.out.println(dll.isloop());
//        dll.DLLreverse();
//        dll.printValuesForward();
        
    }
}