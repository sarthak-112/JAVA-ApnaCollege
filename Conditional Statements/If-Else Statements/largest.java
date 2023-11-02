import java.util.Scanner;

public class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>=B)
        {
            System.out.println("A IS LARGEST");
        }
        else
        {
            System.out.println("B IS LARGEST");
        }
        sc.close();
    }
    
}
