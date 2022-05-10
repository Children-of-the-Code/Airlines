package Controller;

import Model.Airline;
import Model.Flight;
import Service.AirlineService;
import Service.FlightService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

public class AirController {

    /*
    we'll need to add javalin to our pom xml...
    */

    public AirController(){

    }

    public void startController(){
        Javalin app = Javalin.create();
        AirlineService airlineService = new AirlineService();
        FlightService flightService = new FlightService();
        app.start(5000);
//        javalin accepts either an initial slash or no

        app.get("flight", context -> {
//            I want to return a json of all flights
            context.json(flightService.getAllFlights());
        });
        app.get("flight/flightID/{id}", context -> {
//            I want to return a json of a single flight
            int flightID = Integer.parseInt(context.pathParam("id"));
            context.json(flightService.getFlight(flightID));
        });
        app.get("airlines", context -> {
//            I want to return a json of all airlines
            context.json(airlineService.getAllAirlines());
        });
        app.post("flight", context -> {
//            I want to just post a flight that I get from the request body
            ObjectMapper mapper = new ObjectMapper();
            Flight flightToBeAdded = mapper.readValue(context.body(), Flight.class);
            flightService.addFlight(flightToBeAdded);
        });
        app.put("flight", context -> {
//            I just want to update an existing flight's status
//            parse: a string can not be easily converted to a int, right -
//            java has a utility for us to gather a number from a string character by character
//            so, if we have a string "123" we need to convert it to a number 123
            ObjectMapper mapper = new ObjectMapper();
            Flight flightToBeUpdated = mapper.readValue(context.body(), Flight.class);
            flightService.updateFlight(flightToBeUpdated);
        });
        app.post("airline", context -> {
            ObjectMapper mapper = new ObjectMapper();
            Airline airlineToBePosted = mapper.readValue(context.body(), Airline.class);
            airlineService.addAirline(airlineToBePosted);
        });
        app.delete("flight/flightID/{id}", context -> {
            int flightID = Integer.parseInt(context.pathParam("id"));
            flightService.deleteFlight(flightID);
        });
        app.get("flight/cancelled", context -> {
            context.json(flightService.getAllCancelledFlights());
        });
    }


}
