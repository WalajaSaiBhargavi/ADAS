package BinarySearch;

public class RecursiveBS {

    public boolean BinarySearch(int[] arr, int N, int K, int lo, int hi) {
        if (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == K)
                return true;
            else if (arr[mid] > K) {
                return BinarySearch(arr, N, K, lo, mid - 1);
            } else {
                return BinarySearch(arr, N, K, mid + 1, hi);
            }
        }
        return false;
    }
}
