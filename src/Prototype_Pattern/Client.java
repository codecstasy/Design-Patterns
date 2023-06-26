package Prototype_Pattern;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Flight flights = new Flight();
        flights.loadDefaultFlightList();
        System.out.println(flights.getDefaultFlightList());

        Flight morningFlights = (Flight) flights.clone();
        System.out.println(morningFlights.getDefaultFlightList());
    }
}
