package h1;

public class H1_main {
	public static void main(String[] args) {
		Node d = new Node(null);
		Node c = new Node(d);
		Node b = new Node(c);
		Node a = new Node(b);
		
		System.out.println(distance(a,d));
	}
	
	public static int distance(Node x, Node y) {
		if(x==y) {
			return 0;
		}
		
		return 1 + distance(x.next, y);
	}
}
