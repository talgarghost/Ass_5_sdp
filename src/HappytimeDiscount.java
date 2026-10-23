public class HappytimeDiscount implements DiscountStrategy{
    @Override
    public double calculateTotal(double rawAmout){

        return rawAmout-900;
    }
}
