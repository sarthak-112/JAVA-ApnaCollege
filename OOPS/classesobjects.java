public class classesobjects{
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Blue");
        System.out.println(p1.color);
        bankAcc  b1 = new bankAcc();
        b1.username = "Rohan";
        // b1.password = "1234"; shows error as password is private
        b1.setPassword("1234");
        
    }
}
class bankAcc{
    //ACCESS MODIFIERS
    public String username;
    //private String password;
    public void setPassword(String pass){
     //   password = pass;

    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float marks;

    void setName(String newName){
        name = newName;
    }
}