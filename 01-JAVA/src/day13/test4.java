package day13;

import java.util.Scanner;

class scheck{
	boolean check(String name) {
		char s = 's';
		char ch[] = name.toCharArray();

		int i =0;
		for (i=0; i<ch.length;i++) {
			if(ch[i] == s) {
				break;
			}	
		}
		
		if (ch[i] == s) {
			return true;
		}else {
			return false;
		}
			
	}

}

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.next();
		
		scheck schecked = new scheck();
		boolean result = schecked.check(name);
		
		if (result == true) {
			System.out.println("name contains 's'");
		}else {
			System.out.println("name does not contain 's'");
		}

	}

}
