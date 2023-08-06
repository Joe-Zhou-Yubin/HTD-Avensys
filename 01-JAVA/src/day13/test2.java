package day13;
import java.util.Scanner;

class Compare1{
	boolean check (String name, String name1) {
		if ( name.equals(name1)) {
			return true;
		}else {
			return false;
		}
	}
}


public class test2 {

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
			System.out.println("names are equal");
		}else {
			System.out.println("names are not equal");
		}
	}

}
