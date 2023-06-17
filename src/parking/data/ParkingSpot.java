package parking.data;

public class ParkingSpot {

    private final String floorNum;
    private final VehicleType vehicleType;
    private final String Name;
    private  boolean isFree;

    public ParkingSpot(String floorNum, VehicleType vehicleType, String name, boolean isFree) {
        this.floorNum = floorNum;
        this.vehicleType = vehicleType;
        Name = name;
        this.isFree = isFree;
    }

    public String getFloorNum() {
        return floorNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return Name;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree() {
        isFree = true;
    }
}
