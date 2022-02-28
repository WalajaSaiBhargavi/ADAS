package dataStructures.strings;

public class ReverseAString {
	
	public static void main(String[] args) {
		String name = "bhargavi";
	    System.out.println(reverseRecursion(name));
	    System.out.println(reverseLoop(name));
	}

	private static String reverseRecursion(String name) {
		if (name.length() == 0) return "";
		char c = name.charAt(0);
		String rev = reverseRecursion(name.substring(1, name.length()));
		return rev + c;
	}
	
	private static String reverseLoop(String name) {
		char[] letters = name.toCharArray();
		for(int i=0; i < (name.length()/2) - 1; i++) {
			int j = name.length() - 1 - i;
			char temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
		}
		return letters.toString();
	}
}
