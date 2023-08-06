package day16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	int age;
	int marks;
	String college;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		name = scan.next();
		System.out.println("Enter age:");
		age = scan.nextInt();
		System.out.println("Enter marks:");
		marks = scan.nextInt();
		System.out.println("Enter college:");
		college = scan.next();	
		}
	
	public void display() {
		System.out.println();
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int stuNum = scan.nextInt();
		
		int i;
		List<Student> stuList = new ArrayList<Student>();
		for( i=0; i<stuNum;i++) {
			System.out.println("Please input following for student"+(i+1));
			Student st = new Student();
			st.acceptInput();
			stuList.add(st);
			st.display();
			System.out.println("************");
		}
		for (int j=0;j<stuList.size();j++) {
			System.out.println("Student "+j+" : ");
			System.out.println(stuList.get(j).name);
			System.out.println(stuList.get(j).age);
			System.out.println(stuList.get(j).marks);
			System.out.println(stuList.get(j).college);
			System.out.println("**********");
		}
		
	}

}
