package day5;
import java.util.Scanner;
public class day5practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number:");
		int numberGiven = scanner.nextInt();
		
		if (numberGiven % 2 == 0) {
			int oddNumber = numberGiven - 1;
			for (int i =1; i<=(oddNumber+1)/2; i++) {
				for (int k = (oddNumber-1)/2; k >=i; k--) {
					System.out.print("  ");
				}
				
				for (int j =1; j<=i*2-1;j++) {
					int n = j + 64;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}
		}
		else{
			for (int i =1; i<=(numberGiven+1)/2; i++) {
				for (int k = (numberGiven-1)/2; k >=i; k--) {
					System.out.print("  ");
				}
				
				for (int j =1; j<=i*2-1;j++) {
					int n = j + 64;
					char nchar = (char) n;
					System.out.print(nchar+" ");
				}
				System.out.println();
			}
		}


	}

}
