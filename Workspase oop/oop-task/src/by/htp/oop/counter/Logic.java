package by.htp.oop.counter;

import by.htp.oop.counter.Counter;

public class Logic {

	public int check(Counter count) {
		int counter = count.getCounter();
		int min = count.getMin();
		int max = count.getMax();

		int x = 0;
		if (counter > max || counter < min) {
			x = 10;
		} else if (counter >= max - 1 & counter <= max) {
			x = 1;
		} else if (counter <= min + 1 & counter >= min) {
			x = 2;
		}
		return x;
	}

	public int Increment(int counter) {
		int counterIncr = counter + 1;
		return counterIncr;
	}

	public int Decrement(int counter) {
		int counterDecr = counter - 1;
		return counterDecr;
	}
}
