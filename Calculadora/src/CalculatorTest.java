public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator x = new Calculator();
		
		x.performOperation(10.5);
		x.performOperation("+");
		x.performOperation(5.2);
		x.performOperation("*");
		x.performOperation(10);
		x.performOperation("=");
		x.getResults();
	}

}