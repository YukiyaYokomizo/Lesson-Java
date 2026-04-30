package jp.co.aforce.SecTen;

public class Person {
	String name;
	int age;

	Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("あーー");
	}

	public static void main(String[] args) {
		Person person = new Person("Taro", 32);
		person.showInfo();
	}
}
