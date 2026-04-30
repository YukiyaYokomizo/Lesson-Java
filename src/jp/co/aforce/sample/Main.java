package jp.co.aforce.sample;

public class Main {
	public static void main(String[] args) {
		//		Animal dog = new Dog();
		//		Animal cat = new Cat();
		//		
		//		dog.speak();
		//		cat.speak();

		//		Person person = new Person("a", 3);
		//		System.out.println(person.toString());

		//		Employee emp1 = new Employee(101, "Taro");
		//        Employee emp2 = new Employee(101, "Hanako");
		//        Employee emp3 = new Employee(102, "Jiro");
		//
		//        System.out.println(emp1.equals(emp2));
		//        System.out.println(emp1.equals(emp3));

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, World!");
			}
		});

		thread.start();
	}
}
