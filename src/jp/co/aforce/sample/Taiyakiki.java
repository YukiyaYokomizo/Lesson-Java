package jp.co.aforce.sample;

public class Taiyakiki extends Taiyaki{
	public static void main(String[] args) {
		Taiyaki tai1 = new Taiyaki();
		Taiyaki tai2 = new Taiyaki();
		
		tai1.setFilling("クリーム");
		tai2.setFilling("あんこ");
		tai1.showFilling();
		tai2.showFilling();
	}
}
