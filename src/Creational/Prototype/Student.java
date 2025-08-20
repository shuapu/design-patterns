package Creational.Prototype;

import java.util.Objects;

public class Student implements Prototype {
    private String name;
    private int age;
    private String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public Student(Student student) {
        if (Objects.nonNull(student)) {
            this.name = student.getName();
            this.age = student.getAge();
            this.section = student.getSection();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return String.format("Name : %s  Age : %d  Section : %s",name,age,section);
    }

    @Override
    public Prototype clone() {
        return new Student(this);
    }
}
