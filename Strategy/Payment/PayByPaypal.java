public class PayByPaypal implements PaymentStrategy {
    private String email;
    private String password;

    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public void collectPaymentDetails() {
    
        setEmail(email);
        setPassword(password);
    }

    @Override
    public boolean validatePaymentDetails() {
        
        return false;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paying "+amount+" using Paypal");
    }
    

    
    
}
