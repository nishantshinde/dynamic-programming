package nishantshinde.fibonacci;

public class App {

	public static void main(String[] args) {
		FibonacciAlgorithm fa = new FibonacciAlgorithm();
		int number = 9;
		System.out.println(fa.naiveFibonacci(number));
		System.out.println(fa.fibonacciMemoized(number));
	}

}
