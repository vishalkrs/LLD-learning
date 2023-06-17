package parking.data;

public class Ticket {

    private final String referenceNum;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;

    public Ticket(String referenceNum, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.referenceNum = referenceNum;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
