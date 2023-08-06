package day4;

import java.util.Scanner;

public class day4numberarray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();
		
//		calculate first number needed
		int n = 0;
		for (int i = 1; i <= numberGiven; i++) {
			for (int j = 1; j <=i ; j++) {
				n = n+1;
			}
		}

//		print n
		for (int i = 1; i <= numberGiven; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(n + " ");
				n = n-1;
			}
			System.out.println();
		}


	}

}
