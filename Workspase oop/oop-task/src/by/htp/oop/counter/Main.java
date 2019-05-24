package by.htp.oop.counter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int counter;
		int min;
		int max;

		Scanner sc = new Scanner(System.in);

		System.out.print("������� ������ ������ ���������: ");
		min = sc.nextInt();

		System.out.print("������� ������� ������ ���������: ");
		max = sc.nextInt();

		System.out.print("������� ���������� �����: ");
		counter = sc.nextInt();

		Counter count = new Counter(counter, min, max);
		Logic temp = new Logic();

		int x = temp.check(count);

		if (x >= 10) {
			System.out.println("���� ����� �� ����������� ������������� ���������.");
		} else if (x == 2) {
			System.out.println("���������� �������� �������� � ���������� ���������� ���������. ");
			System.out.println("��� ���������� �������� �������� ��������:" + temp.Increment(counter));
		} else if (x == 0) {
			System.out.println("��� ���������� �������� �������� ��������:" + temp.Increment(counter));
			System.out.println("��� ���������� �������� �������� ��������:" + temp.Decrement(counter));
		} else if (x == 1) {
			System.out.println("���������� �������� �������� � ���������� ���������� ���������. ");
			System.out.println("��� ���������� �������� �������� ��������:" + temp.Decrement(counter));
		}

	}

}
