public class PythagoreanTest {
    public static void main(String[] args){
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        Pythagorean x=new Pythagorean();
        double y=x.calculateHypotenuse(3,4);
        System.out.println(y);
    }
}