package parking.manager;

import parking.data.VehicleType;

public class VehicleTypeManagerFactory {

    private VehicleTypeManagerFactory(){ }
    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType) {

        if (vehicleType.equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerManager();
        }
        else if(vehicleType.equals(VehicleType.THREE_WHEELER)) {
            return new TwoWheelerManager();
        }
        else if(vehicleType.equals(VehicleType.HEAVY)) {
            new HeavyVehicleManager();
        }
        throw new IllegalArgumentException("Wrong Vehicle type passed");

    }


}
