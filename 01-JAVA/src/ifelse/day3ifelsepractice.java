package ifelse;

import java.util.Scanner;

public class day3ifelsepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int numberOfRow = scanner.nextInt();

		for (int i = numberOfRow; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k <= numberOfRow; k++) {
				if (i>=numberOfRow-1 || i==1 || k == i || k == numberOfRow) {
					System.out.print(" o");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
