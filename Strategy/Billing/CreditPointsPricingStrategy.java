public class CreditPointsPricingStrategy implements PricingStrategy {
    private int creditpoints;

    public CreditPointsPricingStrategy(int creditpoints) {
        this.creditpoints = creditpoints;
    }

    @Override
    public float calculateTotal(float cost) {
        float discount = creditpoints / 100.0f; // 100 creditpoints = 1 % discount
        return cost - discount;
    }

}
