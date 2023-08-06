package day12;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(".append");
        StringBuilder first=new StringBuilder("String");
        //This line is appending the String in the sequence
        first.append("hello");
        System.out.println(first);
        //This line is appending the integer to the sequence
        first.append(1);
        System.out.println(first);
        System.out.println();
        
        System.out.println(".capacity");
        StringBuilder m=new StringBuilder();
        System.out.println("Default Capacity"+m.capacity());
        //Capacity increase by (16(default capacity)+1)*2=34
        m.append("12345678912345678");
        System.out.println("new Capacity"+m.capacity());
        System.out.println();
        
        System.out.println(".charAt");
        StringBuilder n=new StringBuilder("Scaler");
        //Printing the character present at index 0
           System.out.println(n.charAt(0));
       //This line will cause an error due to the invalid
       //Range of the index value
           System.out.println(n.charAt(11));
         
        





	}

}
