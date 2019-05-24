package by.htp.oop.clock6;

import java.util.Scanner;
import by.htp.oop.clock6.Clock;

public class Logic {

	public int enter(String message) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		x = sc.nextInt();
		return x;
	}

	
	public int checkH(int x) {
		int hour;
		
		if (x >= 24 || x < 0) {
			hour = 0;
		} else {
			hour = x;}
		return hour;
	}

	
	public int check(int x) {
		int hour;
		
		if (x >= 60 || x < 0) {
			hour = 0;
		} else {
			hour = x;}
		return hour;
	}

	
	public int timeHChange() {
		int hourChange;

		Scanner sc = new Scanner(System.in);

		hourChange = enter("На сколько изменить часы? ");
		
		while (hourChange > 24 || hourChange < 0) {
			System.out.print("Вы ввели некорректное значение. ");
			hourChange = enter("На сколько изменить часы? ");
		}
		return hourChange;
	}

	public int timeChange() {
		int timeChange;

		Scanner sc = new Scanner(System.in);

		timeChange = enter("На сколько изменить минуты(секунды)? ");
		
		while (timeChange > 60 || timeChange < 0) {
			System.out.print("Вы ввели некорректное значение. ");
			timeChange = enter("На сколько изменить минуты(секунды)? ");
		}
		return timeChange;
	}

	
	public void newTime(Clock clock, Clock changeClock) {
		int secund = clock.getSecund();
		int minute = clock.getMinute();
		int hour = clock.getHour();

		int changeSecund = changeClock.getSecund();
		int changeMinute = changeClock.getMinute();
		int changeHour = changeClock.getHour();

		int newSecund = 0;
		int newMinute = 0;
		int newHour = 0;

		newSecund = secund + changeSecund + newSecund;
		if (newSecund >= 60) {
			newSecund = newSecund - 60;
			newMinute = newMinute + 1;
		}

		newMinute = minute + changeMinute + newMinute;
		if (newMinute >= 60) {
			newMinute = newMinute - 60;
			newHour = newHour + 1;
		}

		newHour = hour + changeHour + newHour;
		if (newHour >= 24) {
			newHour = newHour - 24;
		}
		
		System.out.println("Новое время  " + newHour + ":" + newMinute + ":" + newSecund);

	}
}
