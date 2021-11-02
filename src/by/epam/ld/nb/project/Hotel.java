package by.epam.ld.nb.project;

import by.epam.ld.nb.helpers.Place;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

    private LocalDate dateIn;
    private LocalDate dateOut;
    private String hotel;
    private int price;
    private Place place;
    private ArrayList<Place> reservation;

    public Hotel(){

    }

    public Hotel(LocalDate dateIn, LocalDate dateOut, String hotel, Place place) {
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.hotel = hotel;
        this.place = place;
    }

    public LocalDate getDateIn() {
        return dateIn;
    }

    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }

    public LocalDate getDateOut() {
        return dateOut;
    }

    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Place> getReservation() {
        return reservation;
    }


    public void setReservation(ArrayList<Place> reservation) {
        this.reservation = reservation;
    }

    public String reserve(String hotel, Place place){
        this.hotel = hotel;
        this. place = place;
        reservation.add(place);
        String a = "You reserved place:"+reservation.toString()+"at the hotel"+hotel+"with opened dates";
        return a;

    }

    public String reserveWithDates(String hotel, Place place, LocalDate dateIn, LocalDate dateOut){
        this.hotel = hotel;
        this. place = place;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        reservation.add(place);
        String a = "You reserved place:"+reservation.toString()+"at the hotel"+hotel+". Dates:"+dateIn+"/"+dateOut;
        return a;
    }

    public void wantPrice(int price){
        this.price = price;
        setPrice(price);
    }

    public void actualPrice(){
        int actualPrice = 100000000;
    }
}
