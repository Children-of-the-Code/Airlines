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
//        add will add the flight to the end of the arraylist
        flightArrayList.add(f);
        f.setFlightID(flightArrayList.size()-1);
    }
    public void updateFlight(Flight f){
        flightArrayList.set(f.getFlightID(), f);
    }
    public Flight getFlight(int id){
        return flightArrayList.get(id);
    }
    public void deleteFlight(int id){
        flightArrayList.remove(id);
    }
    public ArrayList<Flight> getAllCancelledFlights(){
        ArrayList<Flight> cancelledFlights = new ArrayList<>();
        /*
        for(int i = 0; i < flightArrayList.size(); i++){
            flightArrayList.get(i);
        }
         */
        for(Flight f : flightArrayList){
            if(f.getStatus() == Flight.Status.CANCELLED){
                cancelledFlights.add(f);
            }
        }
        return cancelledFlights;
    }
}
