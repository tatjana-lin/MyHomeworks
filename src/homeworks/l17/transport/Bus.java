package homeworks.l17.transport;

public class Bus {
    String busNumber;
    String destination;

   public Bus (String busNumber, String destination) {
        this.busNumber = busNumber;
        this.destination = destination;
    }

    public String toString(){
        return "Bus | " + busNumber + " | " + destination;
    }
}
