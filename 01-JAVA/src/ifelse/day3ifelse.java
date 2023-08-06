package ifelse;

import java.util.Scanner;

public class day3ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int k = 1; k <= n; k++) {
				
				if(i==1||i==n||k==1||k==n) {
					System.out.print("o");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
