package Phone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9=new Galaxy("s9",99,"verizon","ring ring ring!");
		IPhone iphonex=new IPhone("x",100,"AT&T","Zing");
		s9.displayInfo();
		System.out.println(s9.Ring());
		System.out.println(s9.unlock());
		iphonex.displayInfo();
		System.out.println(iphonex.Ring());
		System.out.println(iphonex.unlock());
	}

}
