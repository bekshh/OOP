package practice3;


public class Cat extends Animal{
	private int age;
	//constructor using super()
	public Cat(String name,int age) {
		super(name);
		this.age = age;
	}
	//overriding method
	public void makeSound() {
		System.out.println(name + " meows ^_^");
	}
	//overriding eat method
	@Override
	public void eat() {
		super.eat();
		System.out.println("This cat is eating quietly");
	}
	//method overloading in subclass
	public void play() {
		System.out.println(name + " is playing!");
	}
	public void play(String toy) {
		System.out.println(name + " plays with " + toy);
		
	}
}