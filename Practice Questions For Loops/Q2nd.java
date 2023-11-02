import java.util.Scanner;

public class Q2nd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            number = sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.println("do you want to continue press 1 for Yes and 0 for NO");
            choice = sc.nextInt();


        }while(choice==1);
        System.out.println("Sum is " + evenSum);
        System.out.println("Sum is" + oddSum);
        sc.close();
    }
}
