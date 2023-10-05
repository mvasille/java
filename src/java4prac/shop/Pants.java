package java4prac.shop;


public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны");
    }
}