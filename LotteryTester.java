package Lottery;

import java.util.Collections;
import java.util.Scanner;

public class LotteryTester {

	private static Scanner in;

	/**
	 * The main method for the lottery
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);

		LotteryType megaMillions = new LotteryType("Mega Millions", 5, 56);

		System.out
				.println("Would you like to play the " + megaMillions.getLottoName() + ". Type 'yes' if you would, 'n' if not.");
		System.out.println("How many times would you like to play?");
		int rounds = in.nextInt();
		NumberGenerator numWinner = new NumberGenerator(megaMillions);
		Collections.sort(numWinner.getLotNums());
		NumberGenerator numPicker = new NumberGenerator(megaMillions);
		System.out.println("The winning card is: " + numWinner.getLotNums());
		LotteryPayout payout = new LotteryPayout(megaMillions, numWinner,
				numPicker, rounds);
		System.out.println("Your revenue is: $" + payout.getRevenue());
		System.out.println("Your cost is: $" + payout.getTimer());
		System.out.println("the amount times won is " + payout.getCase2());
	}
}
