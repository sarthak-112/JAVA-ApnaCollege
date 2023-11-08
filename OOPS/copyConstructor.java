public class copyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name = "Rohan";
        s1.age = 20;
        s1.marks = 90;
        s1.perc[0] = 90;
        s1.perc[1] = 80;
        s1.perc[2] = 70;

        Student s2=new Student(s1);
        s2.marks = 100;
        s1.perc[0] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s1.perc[i]);
        }
    }
}
    class Student{
        String name;
        int age;
        float marks;
        int perc[];

        Student(Student s1){
            this.name = s1.name;
            this.age = s1.age;
            this.perc = s1.perc;
            System.out.println("Copy Constructor called");
        }
        Student(){
            perc = new int[3];
            System.out.println("Constructor called");}

        Student(String name){
            this.name = name;
         }

        Student(int age){
            this.age = age;
         }

}
