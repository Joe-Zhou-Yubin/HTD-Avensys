package day10;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banscan = new Scanner(System.in);
		System.out.println("number of banks:");
		int bankNum = banscan.nextInt();
		
//		write
		int bank[][][] = new int[bankNum][][];
		for (int i=0;i<bankNum;i++) {
			
			Scanner brascan = new Scanner(System.in);
			System.out.println("number of branches in bank "+i+" :");
			int branchNum = brascan.nextInt();
			
			bank[i] = new int [branchNum][];
			
			for (int j=0;j<branchNum;j++) {
				
				Scanner cusscan = new Scanner(System.in);
				System.out.println("number of customers in branch "+j+" :");
				int custNum = cusscan.nextInt();
				
				bank[i][j] = new int [custNum];
			}
		}
		
		//print
		System.out.println("Banks Branches Customers");
		for (int i=0; i<bankNum;i++ ) {
//			
			for (int j =0;j<bank[i].length ;j++) {
				if (j==0) {
					System.out.print(i +"     ");
				}
				else {
					System.out.print("      ");
				}
				
				System.out.print(j+"        ");
				
				for(int k=0;k<bank[i][j].length;k++) {
					System.out.print(k+" ");
				}
				System.out.println();
				
			}
		}

	}

}
