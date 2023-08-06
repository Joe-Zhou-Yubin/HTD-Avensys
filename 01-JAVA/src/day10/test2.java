package day10;

import java.util.Scanner;
import java.util.*;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner colscan = new Scanner(System.in);
		System.out.println("number of colleges:");
		int collNum = colscan.nextInt();
		
		Scanner clascan = new Scanner(System.in);
		System.out.println("number of classes:");
		int claNum = clascan.nextInt();
		
		Scanner stuscan = new Scanner(System.in);
		System.out.println("number of students:");
		int stuNum = stuscan.nextInt();
		
		int college[][][] = new int[collNum][claNum][stuNum];
		
		System.out.println ("Colleges   Classes   Students");
		for (int i=0;i<collNum;i++) {
			
			for (int j =0;j<claNum;j++ ) {
				System.out.print("   "+i+"    ");
				System.out.print("      "+j+"     ");
				for(int k=0;k<stuNum;k++) {
					System.out.print(k);
				}
				System.out.println();
			}
		}
		

		
		
		
		
		


	}

}
