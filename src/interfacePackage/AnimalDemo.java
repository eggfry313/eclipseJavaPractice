package interfacePackage;

interface Animal {
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("냥냥");
	}
}

public class AnimalDemo{
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		makeSound(d);
		makeSound(c);
	}
	
	static void makeSound(Animal a) {
		a.sound();
	}
}
