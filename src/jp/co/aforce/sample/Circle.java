package jp.co.aforce.sample;

//public class Circle {
//	double radius;
//	
//	Circle(double radius){
//		this.radius = radius;
//	}
//	
//	void Spread() {
//		System.out.println(Math.PI*radius*radius);
//	}
//	
//	public static void main(String[] args) {
//		Circle en = new Circle(8);
//		
//		en.Spread();
//	}
//}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("円を描きます");
    }

    public void showCircleInfo() {
        System.out.println("Circleクラスのメソッドを呼び出しました");
    }

}
