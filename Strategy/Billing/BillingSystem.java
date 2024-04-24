public class BillingSystem {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public float calculateTotalcost(float cost) {

        return pricingStrategy.calculateTotal(cost);
    }

}
