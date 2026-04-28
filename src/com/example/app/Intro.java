package com.example.app;

import com.example.school.Student;

public class Intro {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.name = "Taro";
		student1.grade = 2;
		
		student1.introduce();
	}
}
