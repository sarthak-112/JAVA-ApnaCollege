import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
}
