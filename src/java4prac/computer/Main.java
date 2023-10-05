package java4prac.computer;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты компьютеров и их компонентов
        Processor processor1 = new Processor("Intel Core i7", 3, 4);
        Memory memory1 = new Memory(8, "DDR4");
        Monitor monitor1 = new Monitor("Dell U2718Q", 27, "3840x2160");
        Computer computer1 = new Computer(ComputerBrand.DELL, processor1, memory1, monitor1);

        Processor processor2 = new Processor("AMD Ryzen 5", 32, 6);
        Memory memory2 = new Memory(16, "DDR4");
        Monitor monitor2 = new Monitor("ASUS VG278Q", 27, "1920x1080");
        Computer computer2 = new Computer(ComputerBrand.ASUS, processor2, memory2, monitor2);

        // Включаем компьютеры
        computer1.powerOn();
        computer2.powerOn();

        // Запускаем программы на компьютерах
        computer1.runProgram("Web Browser");
        computer2.runProgram("Video Editing Software");

        // Выключаем компьютеры
        computer1.powerOff();
        computer2.powerOff();
    }
}
