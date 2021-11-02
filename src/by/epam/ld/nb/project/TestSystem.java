package by.epam.ld.nb.project;

import by.epam.ld.nb.helpers.Task;

import java.util.ArrayList;

public class TestSystem {

    private String examSubject;
    private ArrayList<Task> taskList;

    public TestSystem(String examSubject, ArrayList<Task> taskList) {
        this.examSubject = examSubject;
        this.taskList = taskList;

    }

    public String getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(String examSubject) {
        this.examSubject = examSubject;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }
}
