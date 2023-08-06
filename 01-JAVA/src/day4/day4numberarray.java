package day4;

import java.util.Scanner;

public class day4numberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter row:");
		int rowGiven = scanner.nextInt();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter column:");
		int columnGiven = scanner1.nextInt();
		
		//number of rows print		
		for (int i = 0; i <= rowGiven-1; i++) {
//			no column print
			for(int k = 1+ i * columnGiven; k <= columnGiven+i*columnGiven; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
//		alt solution
		int n = 0;
		for (int i = 0; i <= rowGiven-1; i++) {
			for (int j = 0; j <= columnGiven-1; j++) {
				n = n+1;
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
