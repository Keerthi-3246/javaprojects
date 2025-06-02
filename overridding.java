package javaprojects;
class Animal{
	void sound()
{
		System.out.println("animal make sound");
}
}
class Dog extends Animal{
	void sound() {
		System.out.println("dog Barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}

public class overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		Animal a2=new Dog();
		Animal a3=new Cat();
		a1.sound();
		a2.sound();
		a3.sound();
	}

}
