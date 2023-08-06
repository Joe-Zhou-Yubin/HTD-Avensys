package loops;

import java.util.Scanner;

public class day2loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int numberOfRow = scanner.nextInt();

		for (int i = numberOfRow; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print("s");
			}
			for (int k = i; k <= numberOfRow; k++) {
				System.out.print(" o");
			}
			System.out.println();
		}

	}

}
