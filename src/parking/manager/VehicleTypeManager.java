package parking.manager;
import parking.data.ParkingSpot;

import java.util.List;

public interface VehicleTypeManager {

    List<ParkingSpot> getParkingSpot();

    double getParkingFee(double durationHours);


}
