public class LoyaltyDiscount implements DiscountStrategy{
    public double calculateTotal(double rawAmount){
        return rawAmount*0.90;
    }
}
