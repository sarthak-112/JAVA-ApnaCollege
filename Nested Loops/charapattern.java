import java.util.Scanner;

public class charapattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        char ch='A';
        for(int line=1;line<=i;line++){
            for (int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }
        sc.close();
    }
}
