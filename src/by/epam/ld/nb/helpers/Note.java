package by.epam.ld.nb.helpers;

import java.time.LocalDate;

public class Note {

    private int id;
    private LocalDate date;
    private String subject;
    private String context;

    public Note(LocalDate date, int id, String subject, String context){
        this.date = date;
        this.id = id;
        this.subject = subject;
        this.context = context;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "id: " + id + ", date: " + date + ", subject: " + subject + ", context: " + context + ";";
    }
}
