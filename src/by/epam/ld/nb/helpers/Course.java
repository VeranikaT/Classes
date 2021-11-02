package by.epam.ld.nb.helpers;

import java.util.List;

public class Course {

    private String language;
    private Student student;
    private List<Student> course;

    public Course(String language, Student student, List<Student> course) {
        this.language = language;
        this.student = student;
        this.course = course;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Student> getCourse() {
        return course;
    }

    public void setCourse(List<Student> course) {
        this.course = course;
    }

    public void add(Student student) {
        this.student = student;
        course.add(student);
    }
}
