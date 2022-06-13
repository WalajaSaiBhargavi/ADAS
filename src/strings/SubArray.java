package strings;

public class SubArray {
	static int arr[] = {0, 1, 2, 3, 4};
	public static void main (String args[]) {
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length + 1 ; j++) {
				for(int k = i; k < j ; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
