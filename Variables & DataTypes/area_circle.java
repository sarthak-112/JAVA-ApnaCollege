import java.util.Scanner;

public class area_circle {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area;
        area = 3.14f * radius * radius;
        System.out.print(area); 
        sc.close();

    }
}
