import java.util.Scanner;

public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double avg = (a+b+c)/3;
        System.out.println(avg);
        sc.close();
    }
    
}
