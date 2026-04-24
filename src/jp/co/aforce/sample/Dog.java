package jp.co.aforce.sample;

public class Dog {
	String name;
	
	void res() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "gaooo";
		dog.res();
	}
}
