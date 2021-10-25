package helpers;

import java.util.ArrayList;

public class Course {

    private String language;
    private Student student;
    private ArrayList<Student> course;

    public Course(){

    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<Student> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Student> course) {
        this.course = course;
    }

    public void add(Student student){
        this.student = student;
        course.add(student);
    }
}
