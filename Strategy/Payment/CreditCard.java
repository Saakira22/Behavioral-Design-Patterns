public class CreditCard {
    private float amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;

    

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    
    public float getAmount() {
        return amount;
    }
    public String getNumber() {
        return number;
    }
    public String getDate() {
        return date;
    }
    public String getCvv() {
        return cvv;
    }


    public void setAmount(float amount) {
        this.amount = amount;
    }

    
}
