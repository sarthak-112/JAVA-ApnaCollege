import java.util.Scanner;

public class Q3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact=1;
        num = sc.nextInt();
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
    }
}
