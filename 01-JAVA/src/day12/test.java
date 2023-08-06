package day12;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Capital";
		String s2 = "capital";
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings not equal");
		}
		
		
		
	}

}
