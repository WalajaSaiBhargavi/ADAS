package dataStructures.stack;

import java.util.Arrays;

public class NextGreatestNumber {
	
	public static void main(String[] args) {
		int[] digits = {4,1,2,3};
		findNextHighestNumber(digits, digits.length);
	}

	private static int[] swap(int[] digits, int i, int j) {
		int temp = digits[i];
		digits[i] = digits[j];
		digits[j] = temp;
		return digits;
	}
	
	private static int findNextDigit(int[] digits, int i) {
		int j = i - 1;
		while(j != 0) {
			if(digits[j] < digits[i]) {
				return j;
			}
			j--;
		}
		return -1;
	}
	
	private static void findNextHighestNumber(int[] digits, int n) {
		int thresh = -1;
		for(int i = n -1 ; i > 0 ; i--) {
			thresh = findNextDigit(digits, i);
			if(thresh != -1) {
				digits = swap(digits, i, thresh);
				break;
			}
		}
		
		if(thresh != -1) {
			int [] arr = new int[n - thresh - 1];
			for(int i = 0; i < arr.length ; i++) {
				arr[i] = digits[i+thresh + 1];
			}
			Arrays.sort(arr);
			for(int i = 0; i < thresh + 1 ; i++) {
				System.out.print(digits[i]);
			}
			for(int i = 0; i < arr.length ; i++) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.print("NA");
		}
	}
}
