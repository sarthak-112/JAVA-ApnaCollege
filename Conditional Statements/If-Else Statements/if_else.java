import java.util.Scanner;

public class if_else{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("ADULT");
        }
        else if(age>13 && age<18){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("NOT ADULT/TEENAGER : JUST A BABY");
        }
        sc.close();
    }
}