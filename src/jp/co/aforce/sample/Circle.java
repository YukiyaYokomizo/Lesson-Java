package jp.co.aforce.sample;

public class Circle {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void Spread() {
		System.out.println(Math.PI*radius*radius);
	}
	
	public static void main(String[] args) {
		Circle en = new Circle(8);
		
		en.Spread();
	}
}
