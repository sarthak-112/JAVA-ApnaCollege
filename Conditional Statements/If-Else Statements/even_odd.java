import java.util.Scanner;

public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1 % 2 == 0)
        {
            System.out.println("EVEN");
        }  
        else{
            System.out.println("ODD");
        }
        sc.close();
    }
    
}
