package com.example.MathUtils3;

import com.example.utils.MathUtils;
import com.example.utils2.MathUtils2;


public class Main {
	public static void main(String[] arge) {
		int result1 = MathUtils.add(3, 4);
		int result2 = MathUtils2.add(5, 6);
		
		int total = MathUtils.add(result1, result2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(total);
	}
}
