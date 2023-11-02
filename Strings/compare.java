public class compare {
    public static void main(String[] args) {
        String s1="SARTHAK";
        String s2="SARTHAK";
        String s3=new String("SARTHAK");
        if(s1==s2){
            System.out.println("s1==s2");
        }
        else{
            System.out.println("s1!=s2");
        }
        if (s1==s3) {
            System.out.println("s1==s3");
        }
        else{
            System.out.println("s1!=s3");
            
        }

        if(s1.equals(s3)){
            System.out.println("s1.equals(s3)");
        }
        
    }
}
