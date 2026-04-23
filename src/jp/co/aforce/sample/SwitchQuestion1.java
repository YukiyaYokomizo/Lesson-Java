package jp.co.aforce.sample;
public class SwitchQuestion1 {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Other");
        }
    }
}

//出力は Three Other です。 break; がないので、最後まで上から実行される。