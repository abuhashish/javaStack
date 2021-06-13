package Calculator1;
import java.util.ArrayList;
public class advancedCalc {
	static ArrayList<String> stack = new ArrayList<String>();
	public double num;
	public char op;
	public static double sum=0;
	public void preformOperation(Double k) {
		String g;
		g=k.toString();
		stack.add(g);
	}
	public void preformOperation(String Operation) {
		
		stack.add(Operation);
	}
	public void organize() {
		char plus='+';
		char minus='-';
		char equal='=';
		char divide='/';
		char mul='*';
		for (int i =0;i<stack.size();i++) {
			
			if(stack.get(i).charAt(0)==mul) {
				Double g=Double.parseDouble(stack.get(i-1))* Double.parseDouble(stack.get(i+1));
				
				stack.remove(i+1);
				stack.remove(i);
				stack.remove(i-1);
				stack.add(i-1,g.toString());
				i=0;
			

			}
			
			else if(stack.get(i).charAt(0)==divide) {
				Double g=Double.parseDouble(stack.get(i-1))/ Double.parseDouble(stack.get(i+1));
				stack.remove(i+1);
				stack.remove(i);
				stack.remove(i-1);
				stack.add(i-1,g.toString());
				i=0;
			}
			
		}
		for(String us:stack) {
			System.out.println(us);
		}
	}
	public void calc() {
		char plus='+';
		char minus='-';
		char equal='=';
		char divide='/';
		char mul='*';
	
		for (int i =0;i<stack.size();i++) {

			if (stack.get(i).charAt(0)==plus) {
				sum+=Double.parseDouble(stack.get(i-1))+ Double.parseDouble(stack.get(i+1));
			}
			else if (stack.get(i).charAt(0)==minus)
				sum+=Double.parseDouble(stack.get(i-1))- Double.parseDouble(stack.get(i+1));
			else if (stack.get(i).charAt(0)==equal)
				System.out.println(sum);
//		}
	}
}
}
