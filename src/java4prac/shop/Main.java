package java4prac.shop;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(ClothingSize.XS, 20.0, "Красный"),
                new Pants(ClothingSize.M, 35.0, "Синий"),
                new Skirt(ClothingSize.S, 30.0, "Черный"),
                new Tie(ClothingSize.L, 15.0, "Серый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
