package ifelse;

import java.util.Scanner;

public class ifelsepractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int numberOfRow = scanner.nextInt();
//		heart shape
		
//		1st row
		System.out.print(" ");
		for(int i =1; i <= numberOfRow-2; i++) {
			System.out.print("o");
		}
		System.out.print(" ");
		for(int i =1; i <= numberOfRow-2; i++) {
			System.out.print("o");
		}
		System.out.print(" ");
		System.out.println();
		
//		2nd row
		System.out.print("o");
		for(int i =1; i <= numberOfRow-2; i++) {
			System.out.print(" ");
		}
		System.out.print("o");
		for(int i =1; i <= numberOfRow-2; i++) {
			System.out.print(" ");
		}
		System.out.print("o");
		System.out.println();
		
//		triangle below
		for (int i = 1; i <= numberOfRow; i++) {
			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = numberOfRow; j >= i; j--) {
				if(i==numberOfRow || j == numberOfRow || j==i) {
					System.out.print("o ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
