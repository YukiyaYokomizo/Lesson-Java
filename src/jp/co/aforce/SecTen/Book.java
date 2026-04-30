package jp.co.aforce.SecTen;

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
		System.out.println(author);
	}
	
	public static void main(String[] args) {
		Book book = new Book("多様体","松本" , 3000);
		book.showInfo();
	}
}
