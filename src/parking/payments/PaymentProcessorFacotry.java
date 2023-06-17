package parking.payments;

import parking.data.CardDetails;

public class PaymentProcessorFacotry {

    private PaymentProcessorFacotry() {}
    public static PaymentProcessor getCashBasedPaymentProcessor(double amount) {
        return new CashPaymentProcessor(amount);

    }

    public  static PaymentProcessor getCardBasedPaymentProcesor(double amount, CardDetails cardDetails) {
        return new CardPaymentProcessor(amount,cardDetails);
    }


}
