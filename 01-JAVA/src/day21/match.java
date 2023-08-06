package day21;

import java.util.Scanner;


class AgeException extends Exception{
	public String getMessage() {
		return "invalid age";
	}
}

class age{
	int userAge;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input age");
		userAge = scan.nextInt();
	}
	
	public void ageVerify() throws AgeException{
		if (userAge <18) {
			System.out.println("Under Age user");
		}else if (userAge>45){
			System.out.println("Over Age user");
		}else {
			AgeException ie = new AgeException();
			throw ie;
		}
	}
}

public class match {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age newAge = new age();
		try {
			newAge.acceptInput();
			newAge.ageVerify();
			
		}catch (AgeException e) {
			System.out.println("Input age again");
		}

	}

}
