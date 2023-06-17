package parking.manager;

import parking.data.ParkingSpot;

import java.awt.*;

public class ThreeWheelerManager implements  VehicleTypeManager{
    @Override
    public double getParkingFee(double durationHours) {
        return 0;
    }

    @Override
    public List<ParkingSpot> getParkingSpot() {
        return null;
    }
}
