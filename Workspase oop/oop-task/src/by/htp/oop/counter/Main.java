package by.htp.oop.counter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int counter;
		int min;
		int max;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите нижний предел диапазона: ");
		min = sc.nextInt();

		System.out.print("Введите верхний предел диапазона: ");
		max = sc.nextInt();

		System.out.print("Введите десятичное число: ");
		counter = sc.nextInt();

		Counter count = new Counter(counter, min, max);
		Logic temp = new Logic();

		int x = temp.check(count);

		if (x >= 10) {
			System.out.println("Ваше число не принадлежит обозначенному интервалу.");
		} else if (x == 2) {
			System.out.println("Уменьшение счетчика приведет к превышению указанного интервала. ");
			System.out.println("При увеличении счетчика получаем значение:" + temp.Increment(counter));
		} else if (x == 0) {
			System.out.println("При увеличении счетчика получаем значение:" + temp.Increment(counter));
			System.out.println("При уменьшении счетчика получаем значение:" + temp.Decrement(counter));
		} else if (x == 1) {
			System.out.println("Увеличение счетчика приведет к превышению указанного интервала. ");
			System.out.println("При уменьшении счетчика получаем значение:" + temp.Decrement(counter));
		}

	}

}
