package parking.manager;

import parking.data.ParkingSpot;

public class TwoWheelerManager implements  VehicleTypeManager{
    @Override
    public List<ParkingSpot> getParkingSpot() {
        return null;
    }

    @Override
    public double getParkingFee(double durationHours) {
        return 0;
    }
}
