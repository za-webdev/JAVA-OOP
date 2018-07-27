
public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private Double result;
	
	public Calculator(Double operandOne,String operation,Double operandTwo) {
		this.operandOne=operandOne;
		this.operandTwo=operandTwo;
		this.operation=operation;
	}
	
	public Calculator() {
		
	}
	
	
	public void performOperation() {
		if (operation == "+") {
			this.result=this.operandOne + this.operandTwo;
		}
		else if(operation == "-") {
			this.result = this.operandOne - this.operandTwo;
		}
		else {
			System.out.println("Invalid operation ");
		}
	}
	
	public String getResult() {
		return ("The result is "+ this.result);
	}
	
	public static void main(String[] args) {
	
		Calculator wow= new Calculator ((double)1, "+", 5.2);
		wow.performOperation();
		System.out.println(wow.getResult());
	}
}
