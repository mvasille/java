package java4prac.shop;


public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка");
    }
}



