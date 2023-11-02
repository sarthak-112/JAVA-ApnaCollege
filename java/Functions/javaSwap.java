import java.util.Scanner;

public class javaSwap {
    public static void swap(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("a is : " + a);
        System.out.println("b is : " + b); //as in Java only call by value is working it only gives the copy of a and b to the function swap due to which the original a & b remains unchanged
        sc.close();
    }
}
