package day4;

import java.util.Scanner;

public class day4numberarraypractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();
		
		for (int i = 1; i <= numberGiven; i++) {
			for (int j = 1; j <= i; j++) {
				if(j % 2 == 0)
		            System.out.print("0 ");
		        else
		            System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
