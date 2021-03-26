
public class BitwiseOperators {

	public static void main(String[] args) {

		int a = 12;
		int b = 10;
		int c = 8;
		int d = 8;
		int e = 10;

		// 1 1 0 0 // 4
		// 1 0 1 0 // 2
		// 1 0 0 0 // 8
		// 1 0 0 0
		// 1 0 1 0
		// and// 0 0 0 0 // 0

		// Bitwise AND
		int result = a & b;
		System.out.println(result);

		// Bitwise OR
		System.out.println(a | b | c);

		// Bitwise NOT
		System.out.println(~a);
		// 1 0 1 1

		// Bitwise XOR ^
		System.out.println(a ^ b ^ c ^ d ^ e);
		
		// Shifting
		// left-shift
		// 0 0 0 0 1 0 0 0
		// 0 0 1 0 0 0 0 0
		
		int f = c << 2;
		System.out.println(f);
		
		// 100000000000000000000000.. (31) Integer.MIN_VALUE
		// 0111111111111111111...(31)
		// 11111111........00 
		
		System.out.println(Integer.MIN_VALUE << 2);
		System.out.println(b << 2);
		
		// right-shift -- signed right shift
		
		System.out.println(d >> 2);
		
		System.out.println(Integer.MIN_VALUE >> 1);
		
		// unsigned right shift
		System.out.println(Integer.MIN_VALUE >>> 1);
		
		System.out.println(-1 >>> 1);
		
		//1111111111..... 
		
		// can be used in augmented assignment
		d <<= 2;
		d &= 1;
	}
}
