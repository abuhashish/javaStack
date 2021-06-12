package Calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.setOperandOne(5.7);
		calc.setOperandTwo(10.0);
		calc.setOperation('+');
		System.out.println(calc.preformOperation());
	}

}
