
public class Characters {

	
	public static void main(String[] args) {
		
		char c = 'A';
		char b = 'B';
		
		System.out.println((int)c);
		System.out.println(b);
		System.out.println(c + b);
	
		
		Character character = c;
		// Character character = new Character(c);
		
		// 16-bit unsigned integer
		byte b1 = 'A'; 
		
		char A = (char)65.32;
		System.out.println((int)A);
		
		char ch = '\u12F4';
		System.out.println(ch);
		
		Character.isLowerCase(ch);
		
		// escaping character = \
		char newLine = '\n';
		System.out.println(newLine);
		
		System.out.println("\"Hello World\"");
		
		String str = "Hello World";
		System.out.println(str.length());
		
	}
}
