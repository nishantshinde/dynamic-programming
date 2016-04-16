package nishantshinde.coinchange;

import java.util.Arrays;

public class CoinChangeAlgorithm2 {

	public void naiveCoinChange  (int[] coins, int target) {
		int[] current = new int[]{coins[0]};
		solve(current, coins, coins[0], target-coins[0]);
	}
	
	private void solve(int[] currentIteration, int[]coins, int sumSoFar, int remaining) {
		if(remaining==0) {
			System.out.println(Arrays.toString(currentIteration));
		} if (remaining<0) {
			return;
		}
		for(int i=0; i<coins.length; i++) {
			if(coins[i]<currentIteration[currentIteration.length-1]) {
				continue;
			} else {
				// Try by appending i-th coin 
				int[] nextIteration = Arrays.copyOf(currentIteration, currentIteration.length+1);
				nextIteration[nextIteration.length-1]=coins[i];
				solve(nextIteration, coins, sumSoFar+coins[i], remaining-coins[i]);
			}
		}
	}

} 
