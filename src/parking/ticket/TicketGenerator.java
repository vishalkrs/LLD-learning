package parking.ticket;

import parking.data.ParkingSpot;
import parking.data.Ticket;
import parking.data.Vehicle;

public class TicketGenerator {

    public Ticket getTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        String ticketNum = getUniqueTicketNum();
        return new Ticket(ticketNum, vehicle,parkingSpot);
    }


    private String getUniqueTicketNum(){
        return "";
    }

}
