package project;

import helpers.Course;

import java.time.LocalDate;

public class LanguageCourses {
    private LocalDate dateStart;
    private LocalDate dateFinish;
    private String teacher;
    private Course course;

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String formCourse(LocalDate dateStart, LocalDate dateFinish, String teacher, Course course){
        this.teacher = teacher;
        setTeacher(teacher);
        String a = "You course is formed:"+course.toString()+"\nYour teachers.name:"+teacher+"\nYour lessons will be started and finished:"+dateStart+"/"+dateFinish;
        return a;
    }
}
