public class fibonacci {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonaccis(n));
    }
    public static int fibonaccis(int n){
        if(n==1 || n==0){
            return n;
        }
        int fibnm1 = fibonaccis(n-1);
        int fibnm2 = fibonaccis(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
}
