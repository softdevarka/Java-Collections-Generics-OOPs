class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of the student is " + this.name);

        System.out.println("The age of this student is" + this.age);
    }
}

public class Oopsbasic {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Arka";
        s1.age = 21;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Arijit";
        s2.age = 20;
        s2.getInfo();

    }

}
