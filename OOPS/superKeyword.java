public class superKeyword {
    public static void main(String[] args) {
        horse h = new horse();
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class horse extends Animal{
    horse(){
        super.color="brown";
        System.out.println("Horse Constructor");
    }
}
