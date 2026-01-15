package p3;

public class P3_main {
	public static void main(String[] args) {
		System.out.println(zinsen(200000,4));
	}
	
	public static int zinsen(int euro, int years) {
		if(years == 0) {
			return euro;
		} else {
			int neueZinsen = (int) (euro * 0.05);
			
			return zinsen(euro + neueZinsen, years - 1);
		}
	}
}
