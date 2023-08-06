package day7;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		stored in decimal
		byte a;
		a = 45;
		System.out.println(a);
//		output 45
		
//		stored in octal 4*8 + 5*1
		byte b;
		b = 045;
		System.out.println(b);
//		output 37
		
//		stored in hexadecimal 5*1 + 4*16 + ...*16*16 +...
//		https://decimal.info/hex-to-decimal/3/how-to-convert-0X356-to-decimal.html
		byte c; 
		c = 0x45;
		System.out.println(c);
//		output 69
		
//		stored in binary starting from left, 101011 = (1*2^5) + (0*2^4)  + (1*2^3) + (0*2^2) + (1*2^1) + (1*2^0)
//		convert decimal to binary -- divide 2 find remainder 1
//		https://www.baeldung.com/java-binary-numbers
		byte d;
		d = 0b101011;
		System.out.println(d);
//		output 43
		
//		a = 10, b = 11, c = 12 a to f, a*1 + 1 *16
//		https://decimal.info/hex-to-decimal/A/how-to-convert-0XA-to-decimal.html
		byte e;
		e = 0x1a;
		System.out.println(e);
//		output 26
		
		
		

	}

}
