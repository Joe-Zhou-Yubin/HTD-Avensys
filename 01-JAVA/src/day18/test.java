package day18;

class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is eating");
	}
	public void sleep() {
		System.out.println("Tiger is sleeping");
	}
}
class Lion extends Animal{
	public void eat() {
		System.out.println("Lion is eating");
	}
	public void sleep() {
		System.out.println("Lion is sleeping");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class Forest{
	public void acceptAnimal(Animal ani) {
		ani.eat();
		ani.sleep();
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger a1=new Tiger();
		Lion a2=new Lion();
		Dog a3 = new Dog();
		Forest f = new Forest();
		f.acceptAnimal(a1);
		f.acceptAnimal(a2);
		f.acceptAnimal(a3);

	}

}
