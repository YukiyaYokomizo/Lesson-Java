package jp.co.aforce.sample;

public class Counter {
	static int count = 0;

	void inclement() {
		count++;
	}
	

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		c1.inclement();
		c2.inclement();
		c3.inclement();
		
		System.out.println(Counter.count);
	}
}
