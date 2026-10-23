public class Baseprice implements DiscountStrategy {
@Override
    public double calculateTotal(double rawAmout){
    return rawAmout;
}
}
