/**
 * firstNnos
 */
public class firstNnos {

    public static void main(String[] args) {
        int n = 5;
       System.out.println(firstN(n));
    }
    public static int firstN(int n){
        if(n==1){
            return 1;
        }
      int Snm1 = firstN(n-1);
        int Sn = Snm1 + n;
        return Sn;
    }
}