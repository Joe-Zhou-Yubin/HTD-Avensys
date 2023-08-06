package day4;

import java.util.Scanner;

public class day4numberarraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();

		for (int i = numberGiven; i >= 1; i--) {
			for (int j = numberGiven; j >= i; j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
