package day5;

import java.util.Scanner;

public class day5practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//input character
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
//		System.out.print(printNumber);
		
		if (pos <=26) {
//			upper case
//			print row
			for (int j=1; j<=printNumber; j++) {
//				print alphabet
				for (int i = 1; i<=j; i++) {
					int n = i + 64;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}
		}
		else {
//			lower case
			for (int j=1; j<=printNumber; j++) {
				for (int i = 1; i<=j; i++) {
					int n = i + 96;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}

		}
		
		
	

	}

}
