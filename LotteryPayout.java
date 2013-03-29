package Lottery;

import java.util.Collections;

public class LotteryPayout {

	private int revenue = 0;
	private int timer = 0;
	private int case2 = 0;

	public LotteryPayout(LotteryType lotto, NumberGenerator winner,
			NumberGenerator picker, int times) {
		for (int j = 0; j < times; j++) {
			timer++;
			picker = new NumberGenerator(lotto);
			int same = 0;
			for (int i = 0; i < lotto.getNumsOfBalls(); i++) {
				if (winner.getLotNums().contains(picker.getLotNums().get(i))) {
					same++;
				}
			}
			switch (same) {
			case 3:
				revenue += 7;
				case2++;
				break;
			case 4:
				revenue += 150;
				case2++;
				break;
			case 5:
				Collections.sort(picker.getLotNums());
				System.out.println("You won $250000! with the lottery numbers : " + picker.getLotNums());
				revenue += 250000;
				break;
			}
		}
	}

	public int getRevenue() {
		return revenue;
	}

	public int getTimer() {
		return timer;
	}
	
	public int getCase2() {
		return case2;
	}
}
