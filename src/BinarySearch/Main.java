package BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 5;
        int k = 55;
        System.out.println(new IterativeBS().BinarySearch(arr, arr.length, K));
        System.out.println(new IterativeBS().BinarySearch(arr, arr.length, k));
        System.out.println(new RecursiveBS().BinarySearch(arr, arr.length, K, 0, arr.length-1));
        System.out.println(new RecursiveBS().BinarySearch(arr, arr.length, k, 0, arr.length-1));
    }
}
