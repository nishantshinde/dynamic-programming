package nishantshinde.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciAlgorithm {
	
	private Map<Integer, Integer> memoizeTable = new HashMap<Integer, Integer>();
	
	
	
	public FibonacciAlgorithm() {
		memoizeTable = new HashMap<Integer, Integer>();
		memoizeTable.put(0, 0);
		memoizeTable.put(1, 1);
	}

	public int naiveFibonacci(int n) {

		if(n==0) return 0;
		if(n==1) return 1;
		
		return naiveFibonacci(n-2) + naiveFibonacci(n-1); 
	}

	public int fibonacciMemoized(int n) {
		
		if(memoizeTable.containsKey(n)) {
			return memoizeTable.get(n);
		} else {
			int fibonacci = fibonacciMemoized(n-2) + fibonacciMemoized(n-1); 
			memoizeTable.put(n, fibonacci);
			return fibonacci;
		}
	}
}
