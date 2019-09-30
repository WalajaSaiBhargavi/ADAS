package recursion;

public class SumOfnNatualNumbers {
    public static void main(String[] args) {
        System.out.println(sum(9));
    }
    public static int sum(int N){
        if(N == 1)
            return 1;
        return N + sum(N - 1);
    }
}
