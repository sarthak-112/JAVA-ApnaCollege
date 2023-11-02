import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER A NUMBER");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(palindrome!=0){
            int remainder = palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(number==reverse){
            return true;
        }
        return false;
    }
}
