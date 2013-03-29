package Lottery;

public class LotteryType {
	private String lottoName;
	private int numsInLottery;
	private int numsOfBalls;
	
	
	/**
	 * This is the constructor for the type of lottery. 
	 * @param lottoName The name of the Lottery
	 * @param numsOfBalls The number of balls chose
	 * @param numsInLottery The range of the lottery
	 */
	public LotteryType(String lottoName, int numsOfBalls, int numsInLottery){
		this.lottoName = lottoName;
		this.numsOfBalls = numsOfBalls;
		this.numsInLottery = numsInLottery;
	}
	
	public LotteryType(int numsOfBalls, int numsInLottery){
		this.numsOfBalls = numsOfBalls;
		this.numsInLottery = numsInLottery;
	}
	
	public int getNumsInLottery(){
		return this.numsInLottery;
	}
	
	public int getNumsOfBalls(){
		return this.numsOfBalls;
	}
	
	public String getLottoName(){
		return this.lottoName;
	}
	
}
