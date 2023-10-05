package java4prac.shop;

// ClothingSize.java
public enum ClothingSize {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int euroSize;
    private String description;

    ClothingSize(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}
