public class printPrime {
    public static boolean canPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeInrange(int n){
        for(int i=2; i<=n;i++){
            if(canPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeInrange(25);
    }
}