package java6prac.priceable;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Ноутбук", 1000.0);
        Priceable car = new Car("Toyota", 25000.0);
        Priceable realEstate = new RealEstate("Москва", 500000.0);

        System.out.println("Цена предмета: $" + product.getPrice());
        System.out.println("Цена машины: $" + car.getPrice());
        System.out.println("Цена жилья: $" + realEstate.getPrice());
    }
}
