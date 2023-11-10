public class abstracct {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Hen he = new Hen();;
        he.eat();
        he.walk();
    }
}
abstract class Animal {
    String color;
    Animal(){
        color="brown";
    }

    void eat(){
        System.out.println("EATS");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("WALK ON 4 LEGS");
    }
}
class Hen extends Animal{
    void walk(){
        System.out.println("2 legs");
    }
}
