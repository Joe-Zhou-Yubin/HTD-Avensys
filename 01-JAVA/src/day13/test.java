package day13;

import java.util.Scanner;

class Compare{
	boolean check(String name) {
		if (name.contains("S") || name.contains("s")) {
			return true;
		}else {
			return false;
		}
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.next();
		
		Compare compare = new Compare();
		boolean result = compare.check(name);
		if (result== true) {
			System.out.println("String contains 's'");
		}else {
			System.out.println("String does not contain 's'");
		}

	}

}
