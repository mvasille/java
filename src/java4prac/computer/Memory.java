package java4prac.computer;

public class Memory {
    private int sizeGB;
    private String type;

    // Конструктор
    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    // Геттеры и сеттеры
    public int getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Метод для загрузки программы в память
    public void loadProgram(String programName) {
        System.out.println("Программа \"" + programName + "\" загружена в память.");
        // Здесь можно добавить логику для загрузки программы в память
    }

    // Метод для очистки памяти
    public void clearMemory() {
        System.out.println("Память очищена.");
        // Здесь можно добавить логику для очистки памяти
    }
}
