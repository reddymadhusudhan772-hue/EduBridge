class Payment {

    double calculateAmount(double amount) {

        return amount;
    }

    double calculateAmount(double amount, double discount) {

        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment {

    @Override
    double calculateAmount(double amount) {

        return amount + (amount * 2 / 100);
    }
}

class UPIPayment extends Payment {

    @Override
    double calculateAmount(double amount) {

        return amount + (amount * 0.5 / 100);
    }
}

public class PaymentTest {

    public static void main(String[] args) {

        Payment p1 = new CardPayment();

        Payment p2 = new UPIPayment();

        System.out.println("Card Payment: " +
                           p1.calculateAmount(1000));

        System.out.println("UPI Payment: " +
                           p2.calculateAmount(1000));

        System.out.println("Amount after discount: " +
                           p1.calculateAmount(1000, 10));
    }
}