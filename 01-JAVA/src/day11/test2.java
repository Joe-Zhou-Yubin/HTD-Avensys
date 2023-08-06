package day11;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "s1";// cp s1
		String s2 = "s2";// cp s2
		
		String s3 = "s1"+"s2";//cp s1s2
		String s4 = "s1"+"s2";//same cp as s4
		
		if(s3 == s4) {
			System.out.println("references equal");
		}else {
			System.out.println("references not equal");
		}
		
		String s5 = s1 + s2; // plus sign creates object in ncp
		String s6 = s1 + s2;
		
		if(s5 == s6) {
			System.out.println("references equal");
		}else {
			System.out.println("references not equal");
		}
		
		String f1 = "s3"; //cp
		String f2 = f1; //cp
		
		if(f1 == f2) {
			System.out.println("references equal");
		}else {
			System.out.println("references not equal");
		}
		
		String f3 = new String("f3"); //ncp
		String f4 = f3.intern();//ncp convert to cp
		String f5 = "f3";
		//check if f4 has become cp
		if(f4 == f5) {
			System.out.println("references equal");
		}else {
			System.out.println("references not equal");
		}
		
		
		String v1 = "cat";
		String v2 = "dog";
		if (v1.compareTo(v2)>0) {//compare strings through ascii value
			System.out.println("String v1 is greater");
		}else if( v1.compareTo(v2)<0){
			System.out.println("String v2 is greater");
		}else {
			System.out.println("Strings equal");
		}
		
	}

}
