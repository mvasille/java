package java4prac.seasons;

public enum Seasons {
    ВЕСНА("весна", 15),
    ЛЕТО("лето", 25),
    ОСЕНЬ("осень", 10),
    ЗИМА("зима", -5);

    private String название;
    private int средняяТемпература;

    Seasons(String название, int средняяТемпература) {
        this.название = название;
        this.средняяТемпература = средняяТемпература;
    }

    public String getDescription() {
        return (this == ЛЕТО) ? "Теплое время года" : "Холодное время года";
    }

    public int getСредняяТемпература() {
        return средняяТемпература;
    }
}

