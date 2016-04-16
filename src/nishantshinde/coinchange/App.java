package nishantshinde.coinchange;

public class App {

	public static void main(String[] args) {
		int[] coins = new int[]{1,2,3};
		int target = 4;
		
//		CoinChangeAlgorithm1 cca = new CoinChangeAlgorithm1();
		CoinChangeAlgorithm2 cca = new CoinChangeAlgorithm2();
		
		cca.naiveCoinChange(coins, target);

	}

}
