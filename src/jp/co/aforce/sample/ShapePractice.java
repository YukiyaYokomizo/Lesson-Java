package jp.co.aforce.sample;

public class ShapePractice {
	
	public static void callSpecificMethod(Shape shape) {

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.showCircleInfo();

		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.showRectangleInfo();
		}
	}
	
	public static void main(String[] args) {

		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle();

		callSpecificMethod(shape1);
		callSpecificMethod(shape2);
	}

}
