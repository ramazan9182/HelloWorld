
public class ShortCircuting {

	
	public static void main(String[] args) {
		
		
//		boolean result = test1() && test2();
		
//		boolean result2 = test2() || test1();
		
		boolean result3 = test2() && test3() && test1() ;
		
	}
	
	public static boolean test1() {
		System.out.println("test1");
		return false;
	}
	
	public static boolean test2() {
		System.out.println("test2");
		return true;
	}

	public static boolean test3() {
		System.out.println("test3");
		return true;
	}
	
}
