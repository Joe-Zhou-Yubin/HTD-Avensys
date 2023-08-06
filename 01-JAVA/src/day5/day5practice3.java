package day5;

import java.util.Scanner;

public class day5practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter letter:");
		char letterGiven = scanner.next().charAt(0);
		
		
		//find position of character
		int pos = letterGiven - 'A' + 1;
//		System.out.print(pos);
		
		int printNumber = 0;
		if (pos <=26) {
			printNumber = pos;
		}
		else {
			printNumber = pos - 33 + 1;
		}
		
		if (pos <=26) {
			for (int i =printNumber; i>= 1; i--) {
				for (int j =printNumber; j>=i; j--) {
					int n = i + 64;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}
		}
		else {
			for (int i =printNumber; i>= 1; i--) {
				for (int j =printNumber; j>=i; j--) {
					int n = i + 96;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}
		}

	}

}
