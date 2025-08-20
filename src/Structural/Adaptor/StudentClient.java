package Structural.Adaptor;

public class StudentClient {
    public void printStudent(Student student) {
        String studentInfo = String.format("Student first name : %s last name : %s age : %d", student.getFirstName(), student.getLastName(), student.getAge());
        System.out.println(studentInfo);
    }
}
