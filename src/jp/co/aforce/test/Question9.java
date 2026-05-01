package jp.co.aforce.test;
//コードを書く構成はすぐできたが、キャストするときにずっとエラー出て結構時間かかった。一応できた気がする。
//ただline45に書いた通り、キャストする場所によって答えが変わるのでうーんという感じ。あと、渋滞した変数名のつけ方がわからず、最後の方は大文字で始めたものがある。どうすればよかったのだろうか。
import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		//単価
		Scanner i = new Scanner(System.in);
		System.out.println("商品の単価を入力してください：");
		int price = i.nextInt();

		//個数
		Scanner j = new Scanner(System.in);
		System.out.println("購入個数を入力してください：");
		int num = i.nextInt();

		//合計
		int total = price * num;

		//購入金額による割引
		double priceDiscount = 0;
		if (total >= 10000) {
			priceDiscount = total * 0.1;
		} else if (total >= 5000) {
			priceDiscount = total * 0.05;
		} else {
			priceDiscount = 0;
		}
		
		//購入個数による割引
		int numDiscount = 0;
		if (num >= 5) {
			numDiscount = num * 100;
		} else if (num >= 3) {
			numDiscount = num * 50;
		} else {
			numDiscount = 0;
		}
		
		
		int totalDiscount = (int)priceDiscount + numDiscount;
		
		int totalPrice  = total - (int)totalDiscount;//割引後(おそらく、(int)(total - totalDiscount)にすれば答えが異なるが、細かい指示がないのでこのかたちにする。以下同様。)
		double tax = totalPrice * 0.1;//消費税(小数)
		int Tax = (int)tax;//消費税を整数へキャスト
		double taxPrice = totalPrice * 1.1; //消費税込み(小数)
		int TaxPrice = (int)taxPrice;
		
		//表示
		System.out.println(price);
		System.out.println(num);
		System.out.println(total);
		System.out.println(totalDiscount);
		System.out.println(totalPrice);
		System.out.println(Tax);
		System.out.println(TaxPrice);
		
		i.close();
		j.close();
	}
}
