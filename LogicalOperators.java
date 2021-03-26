
public class LogicalOperators {

	// CTRL + SHIFT + F -> Eclipse Formatting

	public static void main(String[] args) {

		int a = 56;
		int b = 34;
		
		int c = 10;
		int d = 9;

		// && -- LOGICAL AND

		// boolean result = a && b; // ILLEGAL
		// (a is greater than b.) AND (c equals to d.)
		boolean resultAND = (a > b) && (c == d);
		
		System.out.println(resultAND);
		
		// ||  -- LOGICAL OR
		
		boolean resultOR = (a > b) || (c == d);
		
		System.out.println(resultOR);
		
		
		// ! -- NOT
		
		boolean resultNOT = !(a > b);
		
		boolean resultNOT2 = (a <= b);
		
		System.out.println(resultNOT);
		

	}

}
