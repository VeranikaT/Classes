package project;

import helpers.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public class NoteBook {

    private ArrayList<Note> noteBook;
    private Note note;

    public NoteBook() {
        noteBook = new ArrayList<Note>();
    }

    public void add(Note note) {
        this.note = note;
        noteBook.add(note);
    }

    public String findByContext(String context) {
        StringBuffer buffer = new StringBuffer("");
        noteBook.forEach(note -> {
            if (note.getContext().equals(context))
                buffer.append(note.toString());
        });
        return buffer.toString();
    }


    public String findByDate(LocalDate date) {
        StringBuffer buffer = new StringBuffer("");
        noteBook.forEach(note -> {
            if (note.getDate().equals(date)) {
                buffer.append(note.toString());
            }
        });
        return buffer.toString();
    }

    @Override
    public String toString() {
        return noteBook.toString();
    }

}
