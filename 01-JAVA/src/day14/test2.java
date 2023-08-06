package day14;

class person14{
	private String name; //instance variables    x,y,z = local variables
	private int age;     //instance variables
	private String city; //instance variables
	
	public void setData(String x, int y, String z) {
		name = x;
		if (y>0) {
			age = y;
		}else {
			System.out.println("invalid age");
		}
		
		city = z;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person14 s = new person14();
		s.setData("joe",19,"singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}

}
