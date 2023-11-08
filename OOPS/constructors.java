public class constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1);
        Student s2=new Student("Rohan");
        System.out.println(s2.name);
        Student s3= new Student(20);
        System.out.println(s3.age); 
    }
}
    class Student{
        String name;
        int age;
        float marks;
        Student(){
            System.out.println("Constructor called");}

        Student(String name){
            this.name = name;
         }

        Student(int age){
            this.age = age;
         }
    }
    
