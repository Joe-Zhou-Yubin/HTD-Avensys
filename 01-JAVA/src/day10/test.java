package day10;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		jagged array
		Scanner scanner = new Scanner(System.in);
		System.out.println("number of banks:");
		int bankNum = scanner.nextInt();
		
		//write
		int bank [][] = new int[bankNum][];
		
		for (int i=0; i<bankNum;i++) {
			Scanner custscan = new Scanner(System.in);
			System.out.println("number of customers in bank" +i+ ":");
			int custnum = custscan.nextInt();
			bank[i] = new int [custnum];
		}
		
		//print
		System.out.println("Bank       Customers");
		for (int i=0; i<bank.length;i++) {
			System.out.print("Bank "+i +" --- ");
			for (int j=0; j<bank[i].length;j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}
