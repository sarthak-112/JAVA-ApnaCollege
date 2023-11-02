package WhileLoop;
import java.util.Scanner;

public class p1ton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while(counter <= n)
        {
            System.out.print(counter);
            counter++;
        }
        System.out.println();
        sc.close();
        
    }
}