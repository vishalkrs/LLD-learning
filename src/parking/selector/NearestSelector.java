package parking.selector;

import parking.data.EntryPoint;

public class NearestSelector implements  ParkingSpotSelector{

    private final EntryPoint entryPoint;

    public NearestSelector(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    @Override
    ParkingSpot selectSpot(List<ParkingSpot> parkingSpots) {

    }
}
