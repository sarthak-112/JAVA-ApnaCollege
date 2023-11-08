public class upperCase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch==' '){
                ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(ch);
                i++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(toUpperCase(str));
    }
}
