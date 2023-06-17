package parking.apis;

import parking.data.Ticket;
import parking.payments.ParkingFeeProcessor;

public class GetParkingFeeAPI {

    public double getParkingFee(Ticket ticket) {
        return new ParkingFeeProcessor().getParkingFees(ticket);
    }

}
