public class PayByCreditCard implements PaymentStrategy{
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard("cardnumber", "expirydate", "cvv");
        
    }

    @Override
    public boolean validatePaymentDetails() {
        
        return false;
    }


    @Override
    public void pay(float amount) {
        System.out.println("Paying "+amount+" using Credit Card");
        creditCard.setAmount(creditCard.getAmount()-amount);
    }

}