package Service;

import Model.Flight;

import java.util.ArrayList;

public class FlightService {
    ArrayList<Flight> flightArrayList;
    public FlightService(){
        flightArrayList = new ArrayList<>();
    }
    public ArrayList<Flight> getAllFlights(){
        return flightArrayList;
    }
    public void addFlight(Flight f){
        flightArrayList.add(f);
    }
    public void updateFlight(Flight f, int id){
        flightArrayList.set(id, f);
    }
    public Flight getFlight(int id){
        return flightArrayList.get(id);
    }
}
