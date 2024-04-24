import java.util.Scanner;

public class Client {
    private PaymentStrategy strategy;
    private float cost;
    private boolean includeDelivery;

    public Client(float cost, boolean includeDelivery) {
        this.cost = cost;
        this.includeDelivery = includeDelivery;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private float getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost: ");
        float cost = sc.nextFloat();
        System.out.println("Include delivery? (true/false): ");
        String input = sc.nextLine(); // Read input as string
        boolean includeDelivery = Boolean.parseBoolean(input);

        Client client = new Client(cost, includeDelivery);
        // Assuming you have a PaymentStrategy object initialized here
        client.setPaymentStrategy(new PaymentStrategy());

        client.processOrder();

        sc.close();
    }
}

class PaymentStrategy {
    public void collectPaymentDetails() {
        // Implementation of collecting payment details
    }

    public boolean validatePaymentDetails() {
        // Implementation of validating payment details
        return true; // Placeholder return value
    }

    public void pay(float amount) {
        // Implementation of payment process
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
}
