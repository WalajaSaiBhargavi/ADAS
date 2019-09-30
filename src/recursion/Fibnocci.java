package recursion;

public class Fibnocci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N){
        if(N < 2)
            return 1;
        return fib(N - 1) + fib(N - 2);
    }
}
