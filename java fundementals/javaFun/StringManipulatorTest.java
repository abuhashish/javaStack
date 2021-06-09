class StringManipulatorTest{
    public static void main(String [] args){
        StringManipulator x=new StringManipulator();
        String g=x.trimAndConcat(" hello  "," whatsup  ");
        System.out.println(g);
        char letter = 'o';
        int a = x.getIndexOrNull("Coding", letter);
        System.out.println(a);
        System.out.println(a); // 2
        String l = x.concatSubstring("Hello", 1, 2, "world");
        System.out.println(l); // eworld
    }
}