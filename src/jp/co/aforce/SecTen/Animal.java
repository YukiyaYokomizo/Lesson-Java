package jp.co.aforce.SecTen;

public class Animal {
	String sounds;
	
	void makeSound() {
		System.out.println(sounds);
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("わんわん！");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("にゃー！");
	}
}