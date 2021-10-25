package helpers;

public class JournalNote {

    private int id;
    private String context;

    public JournalNote(){

    }

    public JournalNote(int id, String context){
        this.id = id;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "id: " + id + ", context: " + context + ";";
    }
}
