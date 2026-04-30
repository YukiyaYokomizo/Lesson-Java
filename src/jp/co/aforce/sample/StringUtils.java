package jp.co.aforce.sample;

public class StringUtils {
	
	static String toUpperCase(String text) {
		return text.toUpperCase();
	}
	
	public static void main(String[] args) {
		String str = "hello java";
		String result = StringUtils.toUpperCase(str);
		System.out.println(result);
	}
}
