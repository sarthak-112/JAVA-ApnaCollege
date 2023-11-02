package WhileLoop;
import java.util.Scanner;

public class SumofNnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("THE SUM IS : " + sum);
        sc.close();
    }  
}
