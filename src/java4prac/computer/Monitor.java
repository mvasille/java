package java4prac.computer;

public class Monitor {
    private String model;
    private int screenSizeInches;
    private String resolution;

    // Конструктор
    public Monitor(String model, int screenSizeInches, String resolution) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(int screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Метод для отображения изображения на мониторе
    public void displayImage(String imagePath) {
        System.out.println("Отображение изображения \"" + imagePath + "\" на мониторе.");
        // Здесь можно добавить логику для отображения изображения
    }

    // Метод для выключения монитора
    public void turnOff() {
        System.out.println("Монитор выключен.");
        // Здесь можно добавить логику для выключения монитора
    }
}
