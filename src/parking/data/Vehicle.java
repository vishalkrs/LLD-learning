package parking.data;

import java.time.LocalDateTime;

public class Vehicle {
    private final String name;
    private final VehicleType vehicleType;
    private final int number;
    private final LocalDateTime entryTime;

    public Vehicle(String name, VehicleType vehicleType, int number, LocalDateTime entryTime) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.number = number;
        this.entryTime = entryTime;
    }

    public String getName() {
        return name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
