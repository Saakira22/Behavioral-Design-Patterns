public class DiscountedPricingStrategy implements PricingStrategy {

    private float discountRate;

    public DiscountedPricingStrategy(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public float calculateTotal(float cost) {

        return cost - (cost * discountRate);  //Amount Saved = cost*discountRate
    }

}
