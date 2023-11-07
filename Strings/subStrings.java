public class subStrings{
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        System.out.println(str.substring(0, 5));
      //  System.out.println(subString(str, 0, 5));
    }
    public static String subString(String str, int si, int ei){
        String substr ="";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}