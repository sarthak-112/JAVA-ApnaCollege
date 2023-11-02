// Given a route containing 4 directions find the smallest route to the end "  WNEENESENNN  " 
public class question {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
    
    public static float getShortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
        }
        int X2=(x*x);
        int Y2=(y*y);
        return (float)Math.sqrt(X2+Y2);
    }
}
