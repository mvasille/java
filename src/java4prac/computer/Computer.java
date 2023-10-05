package java4prac.computer;

public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    // Конструктор
    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры и сеттеры
    public ComputerBrand getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    // Метод для включения компьютера
    public void powerOn() {
        System.out.println("Компьютер марки " + brand + " включен.");
        // Здесь можно добавить логику для включения компьютера
    }

    // Метод для выключения компьютера
    public void powerOff() {
        System.out.println("Компьютер марки " + brand + " выключен.");
        // Здесь можно добавить логику для выключения компьютера
    }

    // Метод для запуска программы на компьютере
    public void runProgram(String programName) {
        System.out.println("Запуск программы \"" + programName + "\" на компьютере.");
        // Здесь можно добавить логику для запуска программы на компьютере
    }

    // Другие методы для работы с компьютером
}
