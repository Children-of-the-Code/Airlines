package Model;

public class Flight {
//    this flight id has nothing to do with the physical flight id...
    private int flightID;
    private String departingCity;
    private String arrivalCity;
    private Status status;

    public Flight(){

    }

    public enum Status{
        ONTIME,
        CANCELLED,
        DELAYED
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public String getDepartingCity() {
        return departingCity;
    }

    public void setDepartingCity(String departingCity) {
        this.departingCity = departingCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID=" + flightID +
                ", departingCity='" + departingCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", status=" + status +
                '}';
    }
}