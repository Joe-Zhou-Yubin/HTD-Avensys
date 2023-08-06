package day14;

class fan14{
	private int amount;
	
	public void setFanAmount (int x) {
		if(x>0) {
			amount = x;
		}else {
			System.out.println("invalid");
		}
	}
	
	public int getFanAmount () {
		return amount;
	}
	
}


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan14 fan = new fan14();
		fan.setFanAmount(10); 
		int fanAmount = fan.getFanAmount();
		System.out.println(fanAmount);

	}

}
