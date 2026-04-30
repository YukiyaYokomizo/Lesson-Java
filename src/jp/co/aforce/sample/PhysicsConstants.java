package jp.co.aforce.sample;

public class PhysicsConstants {
	static final int SPEED_OF_LIGHT = 299792458;
	
	public static void main(String[] args) {
		int time = 1;
		int distance = PhysicsConstants.SPEED_OF_LIGHT*time;
		System.out.println(distance);
		
	}
}
