package parking.payments;

import parking.data.Ticket;
import parking.manager.VehicleTypeManager;
import parking.manager.VehicleTypeManagerFactory;

public class ParkingFeeProcessor {

    public double getParkingFees(Ticket ticket) {
        double duration = 0;
        // figure out duration
        VehicleTypeManager vehicleTypeManager = VehicleTypeManagerFactory.getVehicleTypeManager(ticket.getVehicle().getVehicleType());
        return vehicleTypeManager.getParkingFee(duration);
    }

    public boolean processParkingFees(Ticket ticket, PaymentProcessor paymentProcessor) {
        if(getParkingFees(ticket)!= paymentProcessor.getAmount())
        {
            throw new RuntimeException("");
        }
      return paymentProcessor.executePayment();
    }


}
