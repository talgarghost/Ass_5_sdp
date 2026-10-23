public class Main {
    public static void main(String[] args) {
        // Открываем кассу
        CashRegister posTerminal = new CashRegister();

        // Добавляем товары в корзину
        posTerminal.addItem(new Item("Кола 1L", 600.0));
        posTerminal.addItem(new Item("Сэндвич", 1200.0));
        posTerminal.addItem(new Item("Чипсы", 700.0));
        // Общая базовая сумма = 2500.0

        System.out.println("\n== Ситуация 1: Обычная оплата ==");
        // Ничего не переключаем, работает твой класс Baseprice
        posTerminal.printReceipt();

        System.out.println("== Ситуация 2: Оплата по карте лояльности ==");
        // Передаем твою стратегию LoyaltyDiscount (скидка 10%)
        posTerminal.setDiscountStrategy(new LoyaltyDiscount());
        posTerminal.printReceipt();

        System.out.println("== Ситуация 3: Оплата в Счастливые часы ==");
        // Передаем твою стратегию HappytimeDiscount (минус 900 тг)
        posTerminal.setDiscountStrategy(new HappytimeDiscount());
        posTerminal.printReceipt();
    }
}