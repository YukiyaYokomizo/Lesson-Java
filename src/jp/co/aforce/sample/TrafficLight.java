package jp.co.aforce.sample;

public class TrafficLight {
	enum Light {
		RED, BLUE, YELLOW;

		String getMessage() {
			switch (this) {
			case RED:
				return "止まってください";
			case YELLOW:
				return "注意してください";

			case BLUE:
				return "進んでください";

			default:
				return "不明な信号";

			}
		}
	}
	
	public static void main(String[] args) {
		for (Light light: Light.values()) {
			System.out.println(light + ":" + light.getMessage());
		}
	}
}
