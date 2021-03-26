
// CAST
public class ElementaryProgramming5 {

	
	public static void main(String[] args) {
		
		int a  = 1;
		
		byte b = (byte) a;
		
		int c = 257;
		
		//... 10000001
		// 11111111  --> 255
		// 1 0000 0001
		byte d = (byte) c;
		
		System.out.println(d);
		
		
		// ###################
		
		double e = 56.7;
		
		int f  = (int)e;
		
		System.out.println(f);
		
		int g = (int)45.999F;
		
		System.out.println(g);
		
		double dd = 85.788888611888888888;
		
		System.out.println(dd);
		
		float t = (float)dd;
		
		System.out.println(t);
		
	}
}
