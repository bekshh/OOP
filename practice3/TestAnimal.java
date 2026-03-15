package practice3;

public class TestAnimal {

	public static void main(String[] args) {
		Cat cat = new Cat("Tom",3);
		cat.makeSound();
		cat.eat();
		cat.eats("meat");
		
		cat.play();
		cat.play("pillow");
		

	}

}
