package project;

import helpers.Item;

import java.time.LocalDate;
import java.util.ArrayList;

public class OnlineStore {

    private Item item;
    private LocalDate time;
    private ArrayList<Item> order;

    public OnlineStore(){

    }

    public OnlineStore(Item item){
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
        order.add(item);
    }

    public void addFew(Item... items) {
        for(int i = 0; i < items.length; i++) {
            Item item = items[i];
            order.add(item);
        }
    }

    public void remove(Item item){
        this.item = item;
        order.remove(item);
    }

    public void removeFew(Item... items) {
        for(int i = 0; i < items.length; i++) {
            Item item = items[i];
            order.remove(item);
        }
    }

    public void cancel(ArrayList<Item> order){
        this.order = order;
        order.removeAll(order);
    }

    @Override
    public String toString() {
        return "Your order is completed."+"\nDate:"+time+"\nOrder:"+order.toString();
    }

}
