package jp.co.aforce.sample;



public class Calculator {
//    public static void main(String[] args) {
//        int age = 20;
//        boolean hasStudentID = false;
//
//        if ((age < 25 && hasStudentID) || age == 20) {
//            System.out.println("割引対象です");
//        } else {
//            System.out.println("通常料金です");
//        }
//    }
	
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
	}
}
