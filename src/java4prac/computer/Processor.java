package java4prac.computer;

public class Processor {
    private String model;
    private int clockSpeedGHz;
    private int numberOfCores;

    // Конструктор
    public Processor(String model, int clockSpeedGHz, int numberOfCores) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
        this.numberOfCores = numberOfCores;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void setClockSpeedGHz(int clockSpeedGHz) {
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    // Метод для запуска процессора
    public void start() {
        System.out.println("Процессор запущен.");
        // Здесь можно добавить логику для запуска процессора
    }

    // Метод для остановки процессора
    public void stop() {
        System.out.println("Процессор остановлен.");
        // Здесь можно добавить логику для остановки процессора
    }
}
