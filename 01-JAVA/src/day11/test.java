package day11;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "n1";
		String s2 = "n1";
		//both s1 and s2 are pointing to the same object in HEAP (constant pull)
		
		if(s1 == s2) {
			System.out.println("References are same");
		}
		else {
			System.out.println("References not same");
		}
		//verify if s1 and s2 are pointing same object HEAP
		
		//created in non constant pull
		String n1 = new String("s1");
		String n2 = new String("s1");
		//not pointing to same object in HEAP (non constant pull)
		
		if(n1 == n2) {
			System.out.println("References are same");
		}
		else {
			System.out.println("References not same");
		}
		
		
		String v1 = "s1"; //CP
		String v2 = new String("s1"); //NCP
		
		if(v1.equals(v2)) {
			System.out.println("References are same");
		}
		else {
			System.out.println("References not same");
		}
		
		String f1 = "s1"; //CP cannot be modified
		System.out.println(f1);
		
		f1.concat("s2"); //concat does not affect f1
		System.out.println(f1);
		
		String f4 = f1.concat("s2"); //new variable f4 assigned, no longer constant perimeter
		System.out.println(f4);
		
		String f2 = new String ("s2"); //NCP can be modified
		System.out.println(f2);
		
		String f3 = f2.concat("s1"); //new define string variable for NCP f2
		System.out.println(f3);
	}

}
