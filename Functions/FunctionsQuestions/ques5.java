import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The sum of digits is " + sumOfDig(number) );
        sc.close();
    }
    public static int sumOfDig(int n){
        int sumOfDigits=0;
        while(n>0){
            int lastDigit = n%10;
            sumOfDigits = sumOfDigits + lastDigit;
            n/=10;
        }
        return sumOfDigits;
    }
}
