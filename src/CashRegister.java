import java.util.ArrayList;
import java.util.List;

public class CashRegister {
    private List<Item> cart;
    private DiscountStrategy discountStrategy; // Ссылка на твой интерфейс

    public CashRegister() {
        this.cart = new ArrayList<>();
        // При запуске кассы по умолчанию ставим твою стратегию Baseprice
        this.discountStrategy = new Baseprice();
    }

    // Метод добавления товаров
    public void addItem(Item item) {
        cart.add(item);
        System.out.println("Пробит товар: " + item.getName() + " (" + item.getPrice() + " тг.)");
    }

    // Метод для переключения твоих стратегий на лету (runtime)
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // Метод пробития чека
    public void printReceipt() {
        double subtotal = 0.0;

        // Касса сама высчитывает базовую сумму товаров в корзине
        for (Item item : cart) {
            subtotal += item.getPrice();
        }

        // Касса делегирует расчет финальной суммы твоему интерфейсу DiscountStrategy!
        double finalTotal = discountStrategy.calculateTotal(subtotal);

        System.out.println("---------------------------------");
        System.out.println("Сумма без скидки: " + subtotal + " тг.");
        System.out.println("Итого к оплате:   " + finalTotal + " тг.");
        System.out.println("---------------------------------\n");
    }
}