import java.util.Scanner;

public class strings{
    public static void main(String[] args) {
        String str="abcd";
        String str2=new String("xyz");
        System.out.println(str+str2);


        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
     
        System.out.println(name);
        sc.close();
    }
}