package parking.payments;

import parking.data.CardDetails;

public class CardPaymentProcessor implements PaymentProcessor{

   private final double amount;
   private CardDetails cardDetails;

    public CardPaymentProcessor(double amount, CardDetails cardDetails) {
        this.amount = amount;
        this.cardDetails = cardDetails;
    }

    @Override
    public boolean executePayment() {
        return false;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
