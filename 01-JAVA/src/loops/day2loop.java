package loops;

public class day2loop {

	public static void main(String[] args) {
		int numberOfRow = 5;
		for (int i = numberOfRow; i >= 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k <= numberOfRow; k++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
	}

}
