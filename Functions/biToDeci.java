public class biToDeci {
    public static void binToDec(int binNum){
        int myNumb = binNum;
        int pow = 0;
        int decNum=0;
        while(binNum>0){
            int lastdigit=binNum%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNumb + "=" + decNum );
    }
    public static void main(String[] args) {
        binToDec(110110);
    }
}
