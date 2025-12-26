interface Payment {
    void pay();
}

class MobilePayment implements Payment {
    public void pay() { }
}

class CardPayment implements Payment {
    public void pay() { }
}

class PaymentProcessor {
    public void process(Payment payment) {
        payment.pay();
    }
}
