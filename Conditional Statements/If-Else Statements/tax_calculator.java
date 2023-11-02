import java.util.Scanner;

public class tax_calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tax;
        if(Income < 500000){
            System.out.println("TAX = 0");
        }
        else if(Income > 500000 && Income < 1000000){
            tax = (int) (0.2 * Income);
            System.out.println("TAX = " + tax);
        }
        else{
            tax = (int) (0.3 * Income);
            System.out.println("TAX =" + tax);
        }
        sc.close();
    }
}
