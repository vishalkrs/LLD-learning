package parking.apis;

import parking.data.ParkingSpot;
import parking.data.Ticket;
import parking.data.Vehicle;
import parking.ticket.TicketGenerator;

public class GetTicketAPI {

    public Ticket getTIcket(Vehicle vehicle, ParkingSpot parkingSpot) {
      return new TicketGenerator().getTicket(vehicle,parkingSpot);
    }

}
