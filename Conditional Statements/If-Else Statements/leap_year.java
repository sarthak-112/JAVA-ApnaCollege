import java.util.Scanner;

public class leap_year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 ==0 && year %100 !=0) || (year % 400 == 0))
        System.out.println("LEAP YEAR");
        else
        System.out.println("NOT A LEAP YEAR");
        sc.close();

    }
    
}
