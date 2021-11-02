package by.epam.ld.nb.project;

import by.epam.ld.nb.helpers.Item;
import by.epam.ld.nb.helpers.JournalNote;

import java.time.LocalDate;
import java.util.List;

public class FoodDelivery {

    private Item item;
    private LocalDate time;
    private List<Item> food;

    public FoodDelivery(){

    }

    public FoodDelivery(Item item){
        this.item = item;
    }

    public LocalDate getDate() {
        return time;
    }

    public void setDate(LocalDate date) {
        this.time = time;
    }

    public void add(Item item){
        this.item = item;
        food.add(item);
    }

    public void addFew(Item... items) {
        for(int i = 0; i < items.length; i++) {
            Item item = items[i];
            food.add(item);
        }
    }

    public void remove(Item item){
        this.item = item;
        food.remove(item);
    }

    public void removeFew(Item... items) {
        for(int i = 0; i < items.length; i++) {
            Item item = items[i];
            food.remove(item);
        }
    }

    public void cancel(List<Item> food){
        this.food = food;
        food.removeAll(food);
    }

    @Override
    public String toString() {
        return "Your food will be soon."+"\nDate:"+time+"\nOrder:"+food.toString();
    }

}
