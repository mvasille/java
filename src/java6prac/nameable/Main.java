package java6prac.nameable;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Кошка");

        System.out.println("Название планеты: " + planet.getName());
        System.out.println("Марка машины: " + car.getName());
        System.out.println("Название животного: " + animal.getName());
    }
}
