import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {
        int marks []= new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phys : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);
        marks[2]=marks[2]+1;
        System.out.println("math:"+ marks[2]);
        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage+"%");
        System.out.println("length :" + marks.length);
        sc.close();
    }
}