package day13;

import java.util.Scanner;

class Greater{
	boolean check (String name, String name1) {
		if ( name.compareTo(name1)<0) {//name bigger
			return true;
		}else {//name1 bigger
			return false;
		}
	}
}

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name 1:");
		String name = scan.next();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter name 2:");
		String name1 = scan1.next();
		
		Compare1 compare = new Compare1();
		boolean result = compare.check(name, name1);
		
		if(result == true) {
			System.out.println("name 1 is bigger");
		}else {
			System.out.println("name 2 is bigger");
		}

	}

}
