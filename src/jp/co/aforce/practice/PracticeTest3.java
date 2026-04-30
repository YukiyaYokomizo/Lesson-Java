package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {
	public static void main(String[] args) {
		//4-1
		String[] stationery = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		
		//4-2
		System.out.println(stationery[1]);
		
		//4-3
		Map<Integer, String> nameList = new HashMap<>();
		nameList.put(1, "山田太郎");
		nameList.put(2, "鈴木花子");
		nameList.put(3, "佐藤二郎");
		nameList.put(4, "山田太郎");
		nameList.put(5, "高橋三郎");
		
		//4-4
		//同じ名前の人がいるので、識別するために番号をつけた。
		
		//4-5
		System.out.println(nameList.get(3));
		
		//4-6
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				
		
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
		//拡張for文ではわからなかったです。
		
		//4-7
		
		
	}
}
