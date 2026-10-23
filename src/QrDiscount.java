public class QrDiscount implements DiscountStrategy{
    @Override
    public double calculateTotal(double rewAmout) {
        return rewAmout-300;
    }
}
