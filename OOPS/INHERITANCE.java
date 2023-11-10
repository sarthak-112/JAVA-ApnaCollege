public class INHERITANCE {
    public static void main(String[] args) {
        INHERITANCE inheritance = new INHERITANCE();
        Dog d = inheritance.new Dog();
        d.bark();
        d.eat();
        Cat c = inheritance.new Cat();
        c.meow();
        c.eat();
        German g = inheritance.new German();
        g.bark();
    }
    class Animal{
        String color;
         void eat(){
            System.out.println("Eating");

    }
}
    class Dog extends Animal{
        String breed;
        void bark(){
            System.out.println("Barking: SINGLE INHERITANCE");
        }
    }
    class Cat extends Animal{
        String breed;
        void meow(){
            System.out.println("Meowing : HIERARCHICAL INHERITANCE");
        }
    }
    class German extends Dog{
        void bark(){
            System.out.println("Barking loudly: MULTILEVEL INHERITANCE");
        }
    }
}