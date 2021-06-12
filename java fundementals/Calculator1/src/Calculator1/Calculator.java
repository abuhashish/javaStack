package Calculator1;

public class Calculator implements java.io.Serializable {
private double OperandOne;
private double OperandTwo;
private char Operation;
public Calculator() {
}
public Calculator(double operandOne, double operandTwo, char operation) {
	super();
	OperandOne = operandOne;
	OperandTwo = operandTwo;
	Operation = operation;
}
public double getOperandOne() {
	return OperandOne;
}
public void setOperandOne(double operandOne) {
	OperandOne = operandOne;
}
public double getOperandTwo() {
	return OperandTwo;
}
public void setOperandTwo(double operandTwo) {
	OperandTwo = operandTwo;
}
public char getOperation() {
	return Operation;
}
public void setOperation(char operation) {
	Operation = operation;
}
public double preformOperation() {
	char plus='+';
	char minus='-';
	if(Operation == plus) {
		return  OperandOne+OperandTwo;
	}
	else {
		return OperandOne-OperandTwo;
	}
}

}
