package WhileLoop;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int sum = 0;
        while(counter <= n){
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
