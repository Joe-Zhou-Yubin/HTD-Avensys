package day10;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int a[]=new int [len];
		
		System.out.println("Array is created with size of " +len);
		System.out.println("Enter the elments");
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("1st Array elements are");
		
		for (int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		
		
		int b[] = new int [a.length];
		int k=a.length-1;
		for (int i=0;i<a.length;i++) {
			b[k]=a[i];
			k--;
		}
		System.out.println("2nd Array elements are");
		
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		
		

	}

}
