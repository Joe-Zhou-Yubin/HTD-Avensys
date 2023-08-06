package day10;
import java.io.*;
import java.util.*;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        
        int a[] = new int [n];
        System.out.println("enter array elements: ");
        for (int i=0;i<n;i++) {
        	a[i] = s.nextInt();
        }
        
        System.out.println("Enter element to find: ");
        
        int x=s.nextInt();
        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                System.out.println("Element found at position: "+(i + 1));
                break;
            }
            else
            {
                flag = 0;
                System.out.println("Element not found");
            }
        }
        

	}

}
