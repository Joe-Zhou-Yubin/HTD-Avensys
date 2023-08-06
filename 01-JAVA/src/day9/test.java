package day9;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define number
		Scanner scanner = new Scanner(System.in);
		System.out.println("number of students:");
		int numberGiven = scanner.nextInt();
		
		//write
		String studentName[] = new String[numberGiven];
		
		int studentMark[] = new int[numberGiven];
		
		for (int j = 0; j<numberGiven;j++) {
			Scanner namescan = new Scanner(System.in);
			System.out.println("enter name of student " + (j+1) +" : ");
			studentName[j] = namescan.next();
			
			Scanner scorescan = new Scanner(System.in);
			System.out.println("score of student: " + (j+1) +" : ");
			studentMark[j] = scorescan.nextInt();
			
		}
		
		//print
		for (int i = 0; i<numberGiven;i++) {
			System.out.print(studentName[i]+" ");
			System.out.print(studentMark[i]);
			System.out.println();
		}
		


	}

}
