public class type_promotion {
    public static void main(String args[]) {
        char a='a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println((int)(b-a));
        int A = 10;
        float B = 24.67f;
        long C = 56;
        double D = 67;
        double ans = A+B+C+D;
        System.out.println(ans);
    }
}
