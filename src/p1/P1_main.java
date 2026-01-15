package p1;

public class P1_main {
	public static void main(String[] args) {
		System.out.println(recursive(10,-2));
		
		System.out.println(iterative(10,-2));
	}
	
	public static double recursive(double a, int b) {
		if(b == 0) {
			return 1;
		} else if(b == 1 || b == -1) {
			return a;
		} else {
			if(b > 0) {
				return a * recursive(a, b-1);
			} else {
				return 1 / (a * recursive(a, b + 1));
			}
		}
	}
	
	public static double iterative(double a, int b) {
		double result = 1;
		
		while(b != 0) {
			result = b > 0 ? result * a : result / a;
			
			b = b > 0 ? b - 1 : b + 1;
		}
		
		return result;
	}
}
