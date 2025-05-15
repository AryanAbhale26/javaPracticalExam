interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class differentInterface {
    public static void makePayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }

    public static void main(String[] args) {
        PaymentMethod credit = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod upi = new UpiPayment();

        makePayment(credit, 1500.00);
        makePayment(paypal, 899.99);
        makePayment(upi, 500.00);
    }
}
