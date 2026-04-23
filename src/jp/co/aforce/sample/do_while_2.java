package jp.co.aforce.sample;

public class do_while_2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		do {
			j=j+i;
			i++;
		}while( i < 101);
		System.out.println(j);
	}
}
