public class trappedRain {
    public static void main(String[] args) {
        int bars[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(bars));
    }
    public static int trappedWater(int bars[]){
        int n = bars.length;
        int leftMax[]=new int[n];
        leftMax[0]=bars[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(bars[i], leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=bars[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(bars[i], rightMax[i+1]);
        }
        int trapped = 0;
        for(int i = 0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapped += waterLevel-bars[i];
        }
        return trapped;
    }
}
