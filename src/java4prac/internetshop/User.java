package java4prac.internetshop;

public class User {
    private String username;
    private String password;
    private ShoppingCart cart;

    // Конструктор
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Обычно пароль не хранится в открытом виде, но для упрощения примера оставим его так
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    // Метод для аутентификации пользователя
    public boolean login(String enteredUsername, String enteredPassword) {
        // Проверка введенного логина и пароля
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Аутентификация успешна для пользователя: " + username);
            return true;
        } else {
            System.out.println("Ошибка аутентификации для пользователя: " + username);
            return false;
        }
    }
}
