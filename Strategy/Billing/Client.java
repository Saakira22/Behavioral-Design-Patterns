import java.util.Scanner;

public class Client {

    //Should support multi-threading
    //Practice Debugging
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BillingSystem billingSystem = new BillingSystem();

        System.out.println("Pricing Ways:");
        System.out.println("1-Regular Pricing");
        System.out.println("2-Discount Pricing");
       System.out.println("3-CreditPoints Pricing");
        int choice = scanner.nextInt();
        System.out.println("Enter cost: ");
        float cost = scanner.nextFloat();

        switch (choice) {
            case 1:
                billingSystem.setPricingStrategy(new RegularPricingStrategy());
                float totalRegular = billingSystem.calculateTotalcost(cost);
                System.out.println("Total cost with regular pricing: Rs." + totalRegular);

                break;

            case 2:
                System.out.print("Enter discount rate (in decimal): ");
                float discountrate = scanner.nextFloat();
                billingSystem.setPricingStrategy(new DiscountedPricingStrategy(discountrate));
                float totaldiscounted = billingSystem.calculateTotalcost(cost);
                System.out.println("Total cost with discounted pricing: Rs." + totaldiscounted);
                break;

             case 3:
                System.out.println("No.of.Credit Points: ");
                int creditpoints = scanner.nextInt();
                billingSystem.setPricingStrategy(new CreditPointsPricingStrategy(creditpoints));
                float totalwithCreditPoints = billingSystem.calculateTotalcost(cost);
                System.out.println("Total cost with credit points: Rs." + totalwithCreditPoints);
                break;   

            default:
                break;
        }

        scanner.close();

    }
}
