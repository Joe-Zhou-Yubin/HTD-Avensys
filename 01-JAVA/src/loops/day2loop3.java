package loops;

public class day2loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfRow = 5;
		for (int i = 1; i <= numberOfRow; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = numberOfRow; j >= i; j--) {
				System.out.print("o ");
			}
			System.out.println();
		}

	}

}
