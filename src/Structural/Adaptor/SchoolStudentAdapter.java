package Structural.Adaptor;

public record SchoolStudentAdapter(SchoolStudent schoolStudent) implements Student {

    @Override
    public String getFirstName() {
        return schoolStudent.getName();
    }

    @Override
    public String getLastName() {
        return schoolStudent.getSurname();
    }

    @Override
    public int getAge() {
        return schoolStudent.getAge();
    }
}
