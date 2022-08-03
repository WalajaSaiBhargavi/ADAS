package strings;

public class PowerSet {

	static String s = "abcd";

	public static void main (String [] args) {
		printPowerSet("", 0);
	}
	
	public static void printPowerSet(String sol, int n) {
		if(n == s.length()) {
			System.out.println(sol);
			return;
		}
		printPowerSet(sol + s.charAt(n), n+1);
		printPowerSet(sol + "", n+1);
	}
}