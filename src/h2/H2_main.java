package h2;



public class H2_main {
	public static int[] array = new int[1000];
	
	public static int[] f = new int[1000];
	
	public static void main(String[] args) {
		benchmark(35);
	}
	
	public static void benchmark(int n) {
		int result = 0;
		long startTime = System.nanoTime();
		result = fibonacci(n);
		long endTime = System.nanoTime();
		System.out.println("Fibonacci von " + n + " ist " + result);
		System.out.println("Elapsed nanoseconds (fibonacci): " + (endTime - startTime));
		
		startTime = System.nanoTime();
		result = fibonacciCached(n);
		endTime = System.nanoTime();
		System.out.println("Fibonacci von " + n + " ist " + result);
		System.out.println("Elapsed nanoseconds (fibonacciCached): " + (endTime - startTime));
		
		startTime = System.nanoTime();
		result = fibonacciIterativ(n);
		endTime = System.nanoTime();
		System.out.println("Fibonacci von " + n + " ist " + result);
		System.out.println("Elapsed nanoseconds (fibonacciIterativ): " + (endTime - startTime));
		
	}
	
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) return 1;
		
		return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public static int fibonacciCached(int n) {
		if (n == 1) {
			if (array[0] == 0) array[0] = 1;
			
			return array[0];
		}
		
		if (n == 2) {
			if (array[1] == 0) array[1] = 1;
			
			return array[1];
		}
		
		if(array[n-1] != 0) {
			return array[n-1];
		} else {
			array[n-1] = fibonacciCached(n-2) + fibonacciCached(n-1);
			
			return array[n-1];
		}
	}
	
	public static int fibonacciIterativ(int n) {
		int resultM2 = 1;
		int resultM1 = 1;
		int result = 0;
		
		if (n == 1 || n == 2) return 1;
		
		for(int i = 3; i <= n; i++) {
			result = resultM1 + resultM2;
			
			resultM2 = resultM1;
			resultM1 = result;
		}
		
		return result;
	}
}
