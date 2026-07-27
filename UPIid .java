abstract class Payment {
    protected double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    abstract void pay();
    void receipt() {
        System.out.println("Receipt generated");
        System.out.println("Amount paid: $" + amount);
    }
    void showPaymentStatus() {
        System.out.println("Payment successful");
    }
}
class UPIPayment extends Payment {
    private String upiId;
    UPIPayment(double amount, String upiId) {
        super(amount); 
        this.upiId = upiId;
    }
    @Override
    void pay() {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
    }
}
class CardPayment extends Payment {
    private String cardNo;
    CardPayment(double amount, String cardNo) {
        super(amount); 
        this.cardNo = cardNo;
    }

    @Override
    void pay() {
        System.out.println("Processing Card payment...");
        System.out.println("Card No: **** **** **** " + cardNo.substring(cardNo.length() - 4));
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment(5674.60, "shankar");
        Payment p2 = new CardPayment(5873.44, "1234567890123456");
        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();
        System.out.println(); 
        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    }
}
