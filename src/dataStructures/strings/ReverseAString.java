package dataStructures.strings;

public class ReverseAString {
	
	public static void main(String[] args) {
		String name = "bhargavi";
	    System.out.println(reverse(name));
	}

	private static String reverse(String name) {
		if (name.length() == 0) return "";
		char c = name.charAt(0);
		String rev = reverse(name.substring(1, name.length()));
		return rev + c;
	}
}
