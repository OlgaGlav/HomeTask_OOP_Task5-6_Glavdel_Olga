package by.htp.oop.clock6;

import java.util.Scanner;
import by.htp.oop.clock6.Clock;
import by.htp.oop.clock6.Logic;

public class Main {

	public static void main(String[] args) {
		int hour;
		int minute;
		int secund;

		Scanner sc = new Scanner(System.in);
		Logic time = new Logic();

		hour = time.enter("”кажите часы: ");
		hour = time.checkH(hour);
		minute = time.enter("”кажите минуты: ");
		minute = time.check(minute);
		secund = time.enter("”кажите секунды: ");
		secund = time.check(secund);

		Clock clock = new Clock(hour, minute, secund);

		System.out.println(hour + ":" + minute + ":" + secund);

		int hourChange = time.timeHChange();
		int minuteChange = time.timeChange();
		int secundChange = time.timeChange();

		Clock changeClock = new Clock(hourChange, minuteChange, secundChange);

		time.newTime(clock, changeClock);

	}

}
