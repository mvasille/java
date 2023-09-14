package java2prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ComputerInput {
    Computer inputComputerFromUser();
}

class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}

class Shop implements ComputerInput {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.toString().equalsIgnoreCase(brand + " " + model)) {
                return computer;
            }
        }
        return null; // Компьютер не найден
    }

    @Override
    public Computer inputComputerFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите бренд компьютера: ");
        String brand = scanner.nextLine();
        System.out.print("Введите модель компьютера: ");
        String model = scanner.nextLine();
        return new Computer(brand, model);
    }

    public void displayAllComputers() {
        System.out.println("Компьютеры в магазине:");
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Вывести все компьютеры");
            System.out.println("5. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Computer newComputer = shop.inputComputerFromUser();
                    shop.addComputer(newComputer);
                    break;
                case 2:
                    System.out.print("Введите бренд компьютера для удаления: ");
                    String brandToRemove = scanner.nextLine();
                    System.out.print("Введите модель компьютера для удаления: ");
                    String modelToRemove = scanner.nextLine();
                    Computer computerToRemove = shop.findComputer(brandToRemove, modelToRemove);
                    if (computerToRemove != null) {
                        shop.removeComputer(computerToRemove);
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 3:
                    System.out.print("Введите бренд компьютера для поиска: ");
                    String brandToFind = scanner.nextLine();
                    System.out.print("Введите модель компьютера для поиска: ");
                    String modelToFind = scanner.nextLine();
                    Computer foundComputer = shop.findComputer(brandToFind, modelToFind);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 4:
                    shop.displayAllComputers();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}
