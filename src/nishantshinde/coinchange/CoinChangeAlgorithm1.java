package nishantshinde.coinchange;

import java.util.Arrays;

public class CoinChangeAlgorithm1 {

	public void naiveCoinChange(int[] coins, int target) {
		int[] current = new int[]{coins[0]};
		solve(current, coins, target);
	}
	
	private void solve(int[] currentIteration, int[]coins, int target) {
		
		if(sum(currentIteration)==target) {
			System.out.println(Arrays.toString(currentIteration));;
		} else if(sum(currentIteration)>target) {
			return;
		}
		
		int[] nextIteration = Arrays.copyOf(currentIteration, currentIteration.length+1);
		
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<currentIteration[currentIteration.length-1]) {
				continue;
			} else {
				nextIteration[currentIteration.length]=coins[i];
				solve(nextIteration, coins, target);
			}
		}		
	}
	
	private int sum(int[] solution) {
		int sum = 0;
		for(int coin:solution) {
			sum+=coin;
		}
		return sum;
	}
}
