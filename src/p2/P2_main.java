package p2;

public class P2_main {
	public static void main(String[] args) {
		System.out.println(recursive(17));
	}
	
	public static int recursive(int num) {
		if(num < 1) {
			return 0;
		} else if(num == 1) {
			return 0;
		}
		
		return recursive(num / 2) + 1;
	}
	
	public static int iterative(int num) {
		if(num < 1) throw new ArithmeticException(num + " ist keine Zweierpotenz");
			
		int result = 0;
		
		while (num >= 2) {
			if(num % 2 != 0) throw new ArithmeticException(num + " lässt sich nicht ohne Rest teilen; Log nicht berechenbar");
			
			num /= 2;
			
			result++;
		}
		
		return result;
	}
}
