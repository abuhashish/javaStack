package DLL;

public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        Node n7 = new Node(500);
        dll.push(n1);
        dll.push(n2);
       dll.pop();
       dll.pop();
//        dll.DLLreverse();
//        dll.printValuesForward();
        
    }
}