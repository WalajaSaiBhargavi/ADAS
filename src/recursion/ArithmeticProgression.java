package recursion;

public class ArithmeticProgression {

    public static void main(String[] args) {
        System.out.println(sumOfFirstNAP(2, 3, 5));
    }

    static int sumOfFirstNAP(int a, int d, int n){
        if(n == 1)
            return a;
        return (a + (n - 1)* d) + sumOfFirstNAP(a, d, (n-1));
    }
}
