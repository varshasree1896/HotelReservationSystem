package com.hotelreservationsystem;
import java.util.*;



public class HotelRservationSystem {
    private List<Hotel> hotels;
    public HotelRservationSystem() {
        this.hotels = new ArrayList<Hotel>();
    }
    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }
    public List<Hotel> getHotelList() {
        return this.hotels;
    }

}
