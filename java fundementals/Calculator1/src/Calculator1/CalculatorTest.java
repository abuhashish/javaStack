package Calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		advancedCalc calc=new advancedCalc();
		calc.preformOperation(10.0);
		calc.preformOperation("+");
		calc.preformOperation(10.0);
		calc.preformOperation("+");
		calc.preformOperation(10.0);
		
		calc.preformOperation("*");
		calc.preformOperation(10.0);
		calc.preformOperation("*");
		calc.preformOperation(10.0);
		calc.preformOperation("/");
		calc.preformOperation(10.0);
		calc.preformOperation("=");
		calc.organize();
		calc.calc();
	}	

}
