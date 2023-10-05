package java4prac.internetshop;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println("Товар \"" + product.getName() + "\" добавлен в корзину.");
    }

    public void removeItem(Product product) {
        boolean removed = items.remove(product);
        if (removed) {
            System.out.println("Товар \"" + product.getName() + "\" удален из корзины.");
        } else {
            System.out.println("Товар \"" + product.getName() + "\" не найден в корзине.");
        }
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста. Невозможно оформить покупку.");
        } else {
            double totalCost = calculateTotalCost();
            System.out.println("Оформление покупки. Общая стоимость: " + totalCost + " руб.");
            // Дополнительная логика для оформления покупки, например, обработка платежей.
            clearCart();
        }
    }

    public List<Product> getItems() {
        return items;
    }

    private double calculateTotalCost() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    private void clearCart() {
        items.clear();
        System.out.println("Корзина очищена после оформления покупки.");
    }
}
