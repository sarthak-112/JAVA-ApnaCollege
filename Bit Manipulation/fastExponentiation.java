public class fastExponentiation {
    public static void main(String[] args) {
        int a=5;
        int b=30;
        System.out.println(fastX(a, b));
    }
    public static int fastX(int a, int b){
        int ans=1;
        while (b>0) {
            if ((b&1)==1) {
                ans*=a;
            }
            a*=a;
            b>>=1;
            
        }
        return ans;
    } 
}
 
