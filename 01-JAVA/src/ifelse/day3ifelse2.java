package ifelse;

import java.util.Scanner;

public class day3ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows:");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int k = 1; k <= n; k++) {
				
				if(i>=2 && i<=n-1 && k>=2 && k<=n-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("o");
				}
			}
			System.out.println();
		}
		

	}

}
