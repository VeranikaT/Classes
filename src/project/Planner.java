package project;

import helpers.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public class Planner {
    private ArrayList<Note> planner;
    private Note note;

    public Planner() {
        planner = new ArrayList<Note>();
    }

    public void add(Note note) {
        this.note = note;
        planner.add(note);
    }

    public String findByContext(String context) {
        StringBuffer buffer = new StringBuffer("");
        planner.forEach(note -> {
            if (note.getContext().equals(context))
                buffer.append(note.toString());
        });
        return buffer.toString();
    }


    public String findByDate(LocalDate date) {
        StringBuffer buffer = new StringBuffer("");
        planner.forEach(note -> {
            if (note.getDate().equals(date)) {
                buffer.append(note.toString());
            }
        });
        return buffer.toString();
    }

    @Override
    public String toString() {
        return planner.toString();
    }
}
