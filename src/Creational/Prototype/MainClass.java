package Creational.Prototype;

public class MainClass {
    public static void main(String[] args) {
        /*
         This design pattern helpful when creating new object is costly operations. Like DB connections.
         */

        Student student = new Student("Virat Kohli", 36, "12A");
        Student clonedStudent = (Student) student.clone();
        System.out.println(clonedStudent.toString());

    }
}
