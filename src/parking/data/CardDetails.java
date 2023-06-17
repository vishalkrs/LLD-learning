package parking.data;

public class CardDetails {
    private  final String nameOnCard;
    private  final int pin;
    private  final String cardNumber;

    public CardDetails(String nameOnCard, int pin, String cardNumber) {
        this.nameOnCard = nameOnCard;
        this.pin = pin;
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public int getPin() {
        return pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
