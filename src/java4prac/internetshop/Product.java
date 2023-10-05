package java4prac.internetshop;

public class Product {
    private String name;
    private double price;
    private ProductCategory category;

    // Конструктор
    public Product(String name, double price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
