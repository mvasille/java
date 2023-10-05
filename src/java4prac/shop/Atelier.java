package java4prac.shop;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                System.out.println("Размер: " + item.getSize() + " (" + item.getSize().getDescription() + "), Цвет: " + item.getColor() + ", Стоимость: " + item.getCost());
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                System.out.println("Размер: " + item.getSize() + " (" + item.getSize().getDescription() + "), Цвет: " + item.getColor() + ", Стоимость: " + item.getCost());
                ((MenClothing) item).dressMan();
            }
        }
    }
}

