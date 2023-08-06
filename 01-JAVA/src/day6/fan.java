package day6;

public class fan {
	public String color;
	public String brand;
	public int numberOfBlades;
	
	
	public String getcolor() {
		return color;
	}
	public  void  setColor(String color)  {
		this.color  = color;
	}
	
	public String getbrand() {
		return brand;
	}
	public  void  setBrand(String brand)  {
		this.brand  = brand;
	}
	
	public int getblade() {
		return numberOfBlades;
	}
	public void setBlade(int numberOfBlades) {
		this.numberOfBlades = numberOfBlades;
	}
	
	public void rotate() {
		System.out.println("Fan is rotating");
	}
	public void stop() {
		System.out.println("Fan has stopped");
	}
	public void blowAir() {
		System.out.println("Fan is blowing air");
	}

}
