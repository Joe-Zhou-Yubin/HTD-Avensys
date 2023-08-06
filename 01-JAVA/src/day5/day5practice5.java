package day5;

import java.util.Scanner;

public class day5practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();
		
		for (int i = 1; i <= numberGiven; i++) {
			for (int j = 1; j <= i; j++) {
				if(i % 2 == 0)
		            System.out.print("B ");
		        else
		            System.out.print("A ");
			}
			System.out.println();
		}


	}

}
