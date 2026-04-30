package jp.co.aforce.sample;

//public class Rectangle {
//	//	int width;
//	//	int height;
//	//	
//	//	void Spread(int width, int height) {
//	//		System.out.println( width*height );
//	//	}
//	//	
//	//	public static void main(String[] args) {
//	//		Rectangle sikaku = new Rectangle();
//	//		sikaku.Spread(5, 10);
//	//	}
//
//	//	int width;
//	//	int height;
//	//	
//	//	Rectangle(int a, int b){
//	//		this.height = a;
//	//		this.width = b;
//	//	}
//	//	
//	//	Rectangle(int c){
//	//		this.width = c;
//	//		this.height = c;
//	//	}
//	//	
//	//	void info() {
//	//		System.out.println(width*height);
//	//	}
//	//	
//	//	public static void main(String[] args) {
//	//		Rectangle shape1 = new Rectangle(3, 5);
//	//		Rectangle shape2 = new Rectangle(6);
//	//		
//	//		shape1.info();
//	//		shape2.info();
//	//	}
//
//	static int sum(int... numbers) {
//		int total = 0;
//
//		for (int number : numbers) {
//			total += number;
//		}
//
//		return total;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(sum(1, 2));
//		System.out.println(sum(1, 2, 3));
//		System.out.println(sum(1, 2, 3, 4, 5));
//	}
//}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("四角形を描きます");
    }

    public void showRectangleInfo() {
        System.out.println("Rectangleクラスのメソッドを呼び出しました");
    }
}

