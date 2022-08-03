package strings;

public class SubArray {
	static int arr[] = {0, 1, 2, 3, 4};
	public static void main (String args[]) {
		printSubArrayO3();
		printSubArrayO2();
	}
	private static void printSubArrayO2() {
		for (int i = 0 ; i < arr.length ; i++) { 
			String s = "";
			for (int j = i; j < arr.length ; j++) {
				s = s+arr[j];
				System.out.println(s);
			}
		}
	}
	
	private static void printSubArrayO3() {
		for (int i = 0 ; i < arr.length ; i++) { 
			for (int j = i; j < arr.length ; j++) {
				for(int k = i; k <= j ; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
