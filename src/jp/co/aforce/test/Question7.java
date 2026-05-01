package jp.co.aforce.test;
//負の数と121歳以上を不正な値としている。難しくはなかった（合っていれば）。
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("年齢を入力してください：");
		int age = i.nextInt();
		if (age < 0 || age >120) {
			System.out.println("不正な値です。");
		}else {
			if(age < 4) {
				System.out.println("年齢：" + age + "　入場料：無料" );
			}else if(age < 13) {
				System.out.println("年齢：" + age + "　入場料：500円" );
			}else if (age < 18) {
				System.out.println("年齢：" + age + "　入場料：800円" );
			}else if(age < 60) {
				System.out.println("年齢：" + age + "　入場料：1200円" );
			}else {
				System.out.println("年齢：" + age + "　入場料：700円" );
			}
		}
		i.close();
	}
}
