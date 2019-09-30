package recursion;

public class FindPower {
    public static void main(String[] args) {
        System.out.println(powOptimized(5,3));
    }

    static int pow(int a, int n){
        if(n == 0)
            return 1;
        return a * pow(a,n-1);
    }

    static int powOptimized(int a, int n){
        if(n==0)
            return 1;
        int x = powOptimized(a, n/2);
        return a%2==0 ? x * x : x * x * a;
    }
}
