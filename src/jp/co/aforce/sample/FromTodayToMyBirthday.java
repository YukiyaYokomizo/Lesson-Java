package jp.co.aforce.sample;




import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FromTodayToMyBirthday {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(today.getYear(), 3, 21); // 例: 3月10日

		if (birthday.isBefore(today)) {
			birthday = birthday.plusYears(1);
		}

		long days = ChronoUnit.DAYS.between(today, birthday);

		System.out.println("今日: " + today);
		System.out.println("次の誕生日: " + birthday);
		System.out.println("次の誕生日まであと " + days + " 日です");
	}
}