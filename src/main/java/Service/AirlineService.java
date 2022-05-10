package Service;

import Model.Airline;

import java.util.ArrayList;

public class AirlineService {
//    the angles - designate that the object takes in a generic type -
//    the idea is that arraylist or any java collection is universal
//    but, we need to tell it what object it should take in as we create it
//    we'll learn how this is done thursday
    ArrayList<Airline> airlineArrayList;
    public AirlineService(){

    }
    public void addAirline(Airline airline){
        airlineArrayList.add(airline);
    }
    public ArrayList<Airline> getAllAirlines(){
        return airlineArrayList;
    }
}
