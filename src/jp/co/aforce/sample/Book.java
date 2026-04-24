package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;
	
	void showInfo() {
		System.out.println(title +""+ author +"" +price);
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "aaa";
		book1.author = "aaa";
		book1.price = 300;
		
		book1.showInfo();
		
	}
}
