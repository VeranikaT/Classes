package by.epam.ld.nb.helpers;

public class Place {

    int persons;
    int rooms;
    String comment;

    public Place(int persons, int rooms, String comment) {
        this.persons = persons;
        this.rooms = rooms;
        this.comment = comment;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
