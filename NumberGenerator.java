package Lottery;

import java.util.ArrayList;
import java.util.Random;

public class NumberGenerator {

	ArrayList<Integer> lotNums = new ArrayList<Integer>();
	Random rnd = new Random();
	
	/** Generates the lottery Numbers
	 * @param lotto : the lottery type that is taken
	 */
	public NumberGenerator(LotteryType lotto) {
		for (int i = 0; i < lotto.getNumsOfBalls(); i++) {
			lotNums.add(ballPick(lotto));
		}
	}

	/**
	 * Getter method for getting the Numbers in the lottery
	 * @return
	 */
	public ArrayList<Integer> getLotNums() {
		return lotNums;
	}
	

	/** Picks a ball from the lottery's range 
	 * @param lotto : the corresponding lottery
	 * @return ballpick : the ball that was picked
	 */
	public int ballPick(LotteryType lotto){
		int ballpick = rnd.nextInt(lotto.getNumsInLottery() - 1) + 1;
		if(lotNums.contains(ballpick)){
			// recursive method to make sure not the same ball is picked twice
			ballpick = ballPick(lotto);
		}
		return ballpick;
	}
	
}
