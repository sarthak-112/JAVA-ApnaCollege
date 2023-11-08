public class stringCommpression {
    public static void main(String[] args) {
        String str = "aaabbccds";
        System.out.println(commpress(str));
    }
    public static String  commpress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count;
            }
        }
        return newStr;
    }
}
