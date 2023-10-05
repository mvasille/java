package java4prac.internetshop;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private List<Product> catalog;
    private List<User> users;

    public OnlineStore() {
        catalog = new ArrayList<>();
        users = new ArrayList<>();
    }

    public List<Product> getCatalog() {
        return catalog;
    }

    public List<User> getUsers() {
        return users;
    }

    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Каталог товаров пуст.");
        } else {
            System.out.println("Список товаров в каталоге:");
            for (Product product : catalog) {
                System.out.println("Название: " + product.getName() +
                        ", Категория: " + product.getCategory() +
                        ", Цена: " + product.getPrice() + " руб.");
            }
        }
    }

    public void displayProductsInCategory(ProductCategory category) {
        System.out.println("Список товаров в категории " + category + ":");
        for (Product product : catalog) {
            if (product.getCategory() == category) {
                System.out.println("Название: " + product.getName() +
                        ", Цена: " + product.getPrice() + " руб.");
            }
        }
    }

    public void authenticateUser(String username, String password) {
        boolean authenticated = false;
        for (User user : users) {
            if (user.login(username, password)) {
                authenticated = true;
                break;
            }
        }
        if (!authenticated) {
            System.out.println("Аутентификация не удалась для пользователя: " + username);
        }
    }
}
