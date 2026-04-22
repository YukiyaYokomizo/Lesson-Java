package jp.co.aforce.sample;

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        String str3 = str1.substring(1, 3) + str2.substring(2, 5);
        System.out.println(str3);
    }
}
