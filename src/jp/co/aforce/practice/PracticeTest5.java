package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest5 {
	public static void main(String[] args) {
		//6-1

		//6-2
		int i = 1;
		while (i < 101) {
			if (i % 7 == 0) {
				System.out.print(i + ", ");
			}
			i += 1;
		}

		System.out.println("");
		
		//6-3
		for (int k = 1; k < 10; k++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j*k+", " );
			}
			System.out.println("");
		}

		//6-4
		int num = 10;
		for (int s = num; s < num + 10; s++) {
			for (int t = num; t < num + 10; t++) {
				System.out.print(s*t+", " );
			}
			System.out.println("");
		}
		
		//6-5
		ArrayList<String> employees = new ArrayList<>();					
		employees.add("斎藤");					
		employees.add("田中");					
		employees.add("山田");					
		employees.add("鈴木");					
		employees.add("高橋");					
							
		ArrayList<String> submitters = new ArrayList<>();					
		submitters.add("斎藤");					
		submitters.add("高橋");					
		
	}
}
