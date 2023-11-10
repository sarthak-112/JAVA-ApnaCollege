public class superKeyword {
    public static void main(String[] args) {
        horse h = new horse();
        
    }
}
class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class horse extends Animal{
    horse(){
        super();
        System.out.println("Horse Constructor");
    }
}
