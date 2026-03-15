package practice3;

public class Animal {
	protected String name;
	
	//constructor
	public Animal(String name) {
		this.name = name;
		
	}
	//method
	public void makeSound() {
		System.out.println("Making a sound!");
	}
	//method overloading
	public void eat() {
		System.out.println(name + " is eating!");
	}
	
	public void eats(String food) {
		System.out.println(name + " eats "+ food);
	}
}
