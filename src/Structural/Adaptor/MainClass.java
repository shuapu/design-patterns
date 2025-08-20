package Structural.Adaptor;

public class MainClass {
    public static void main(String[] args) {
        /*
        School Students and Collage Students are not compatible with each others.
        An Adaptor is written to make them compatible and use same client code.
         */
        SchoolStudent schoolStudent = new SchoolStudent("Virat", "Kohli", 38);
        CollageStudent collageStudent = new CollageStudent("Anushka", "Sharma", 35);

        //Compatible Collage Student Object.
        StudentClient studentClient = new StudentClient();
        studentClient.printStudent(collageStudent);

        //Incompatible School student object wrapped under adapter.
        SchoolStudentAdapter schoolStudentAdapter = new SchoolStudentAdapter(schoolStudent);
        studentClient.printStudent(schoolStudentAdapter);

    }
}
