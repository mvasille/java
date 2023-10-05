package java4prac.internetshop;

public class Main {
    public static void main(String[] args) {
        // Создание объектов товаров и пользователей
        Product product1 = new Product("Смартфон", 500.0, ProductCategory.ELECTRONICS);
        Product product2 = new Product("Футболка", 25.0, ProductCategory.CLOTHING);
        Product product3 = new Product("Книга", 15.0, ProductCategory.BOOKS);

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Создание объекта интернет-магазина
        OnlineStore onlineStore = new OnlineStore();

        // Добавление товаров в каталог
        onlineStore.getCatalog().add(product1);
        onlineStore.getCatalog().add(product2);
        onlineStore.getCatalog().add(product3);

        // Добавление пользователей
        onlineStore.getUsers().add(user1);
        onlineStore.getUsers().add(user2);

        // Вызов методов интернет-магазина
        onlineStore.displayCatalog(); // Вывести список товаров в каталоге
        onlineStore.displayProductsInCategory(ProductCategory.CLOTHING); // Вывести товары в категории одежда

        // Попытка аутентификации пользователя
        onlineStore.authenticateUser("user1", "password1");
        onlineStore.authenticateUser("user3", "password3"); // Несуществующий пользователь

        // Операции с корзиной
        ShoppingCart cart = user1.getCart();
        cart.addItem(product1); // Добавить товар в корзину
        cart.addItem(product2);
        onlineStore.displayCatalog(); // Повторно вывести список товаров в каталоге
        cart.removeItem(product2); // Удалить товар из корзины
        onlineStore.displayCatalog(); // Повторно вывести список товаров в каталоге
        cart.checkout(); // Оформить покупку
        onlineStore.displayCatalog(); // Повторно вывести список товаров в каталоге
    }
}
