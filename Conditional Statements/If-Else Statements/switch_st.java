import java.util.Scanner;

public class switch_st {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        switch(A){
            case 1 : System.out.println("HEYYY");
            break;
            case 2 : System.out.println("HELLO");
            break;
            default : System.out.println("WRONG OPTION");
        }
        sc.close();
    }
}
