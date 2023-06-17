package parking.apis;

import parking.data.CardDetails;
import parking.data.PaymentMode;
import parking.data.Ticket;
import parking.payments.ParkingFeeProcessor;
import parking.payments.PaymentProcessor;
import parking.payments.PaymentProcessorFacotry;

import java.util.Map;

public class PayParkingFeesAPI {

    public  boolean payParkingFee(Ticket ticket, PaymentMode paymentMode, Map<String, String> paymentDetails) {
        PaymentProcessor paymentProcessor = null;
        double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
        if(paymentMode.equals(PaymentMode.CARD)) {
            CardDetails cardDetails = null;
            paymentProcessor = PaymentProcessorFacotry.getCardBasedPaymentProcesor(amount,cardDetails);
        }
        else if(paymentMode.equals(PaymentMode.CASH)) {
            paymentProcessor = PaymentProcessorFacotry.getCashBasedPaymentProcessor(amount);
        }
        return new ParkingFeeProcessor().processParkingFees(ticket,paymentProcessor);

    }



}
