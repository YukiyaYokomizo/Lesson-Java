package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title +""+ author +"" +price);
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java", "中垣", 3000);
		
		book1.showInfo();
		
	}
}
