package BinarySearch;

public class IterativeBS {

    public boolean BinarySearch(int[] arr, int N, int K){
        int lo = 0;
        int hi = N-1;
        int mid;
        while(lo <= hi){
            mid = (lo + hi)/2 ;
            if(arr[mid] == K)
                return true;
            else if(K < arr[mid]){
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
        return false;
    }
}
