package java6prac.priceable;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class RealEstate implements Priceable {
    private String location;
    private double price;

    public RealEstate(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
