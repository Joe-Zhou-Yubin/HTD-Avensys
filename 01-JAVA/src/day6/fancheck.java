package day6;

public class fancheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan myfan = new fan();
		myfan.setColor("White");
		System.out.println("Fan color is "+myfan.getcolor());
		
		myfan.setBrand("Dyson");
		System.out.println("Fan brand is "+myfan.getbrand());
		
		myfan.setBlade(4);
		System.out.println("Fan has "+myfan.getblade()+" blades");
		
		myfan.blowAir();
		myfan.rotate();
		myfan.stop();

	}

}
