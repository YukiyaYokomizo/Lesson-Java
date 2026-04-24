package jp.co.aforce.sample;

public class Rectangle {
	int width;
	int height;
	
	void Spread(int width, int height) {
		System.out.println( width*height );
	}
	
	public static void main(String[] args) {
		Rectangle sikaku = new Rectangle();
		sikaku.Spread(5, 10);
	}
	
}
