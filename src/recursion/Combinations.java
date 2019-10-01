package recursion;

public class Combinations {

    static int [] arr = {1,2,3};
    static boolean[] flag = new boolean[3];

    public static void main(String[] args) {
        new Combinations().combinations(arr, 3, 0, flag);
    }

    public  void combinations(int [] arr, int N, int idx, boolean flag[]){
        if(idx == N) {
            for (int i = 0; i < N; i++) {
                if (flag[i])
                    System.out.print(arr[i]+" ");
            }
            return;
        }
         flag[idx] = true;
        combinations(arr, N, idx+1, flag);
         System.out.println();
         flag[idx] = false;
        combinations(arr, N, idx+1, flag);
    }
}
