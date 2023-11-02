import java.util.Scanner;

public class type_cast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a  = 24.24f;
        int b = (int)a;
        System.out.println(b);
        sc.close();
        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }
}
