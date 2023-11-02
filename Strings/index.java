public class index {
    public static void main(String[] args) {
        String name="Sarthak";
        printletters(name);
    }
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.print("");
    }
}
