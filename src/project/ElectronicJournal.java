package project;

import helpers.JournalNote;
import helpers.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public class ElectronicJournal {

    private String subject;
    private LocalDate date;
    private JournalNote note;
    private ArrayList<JournalNote> electronicJournal;

    public ElectronicJournal(){
        electronicJournal = new ArrayList<JournalNote>();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void add(JournalNote note) {
        this.note = note;
        electronicJournal.add(note);
    }

    public void addFewNotes(JournalNote ... journalNotes) {
        for(int i = 0; i < journalNotes.length; i++) {
            JournalNote note = journalNotes[i];
            electronicJournal.add(note);
        }
    }
    public String findByContext(String context) {
        StringBuffer buffer = new StringBuffer("");
        electronicJournal.forEach(note -> {
            if (note.getContext().equals(context))
                buffer.append(note.toString());
        });
        return buffer.toString();
    }

    @Override
    public String toString() {
        return "Date:"+date+"\nSubject:"+subject+"\nJournal context:\n"+electronicJournal.toString();
    }


}
