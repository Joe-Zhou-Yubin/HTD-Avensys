package day4;

import java.util.Scanner;

public class day4numberarray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();
		
		int n = 0;
		for (int i = 1; i <= numberGiven; i++) {
			for (int j = 1; j <=i ; j++) {
				n = n+1;
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
