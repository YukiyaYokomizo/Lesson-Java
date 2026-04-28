package jp.co.aforce.sample;

public class MainMethod9_1 {
	public static void main(String[] args) {
		//9-1
		System.out.println("Hello, World");
		
		//9-2
		int a = 1;
		int b = 2;
		System.out.println(a + b);
		
		
		//9-3
		System.out.println(args[0]);
		
		
		//9-4
		class Animal{
			void makeSound() {
				System.out.println("バウバウ");
			}
		}
		
		Animal dog = new Animal();
		dog.makeSound();
		
		//9-5
		String name = "Taro";
		int age = 30;
		
		System.out.println(name + " " + age);
	}
}
