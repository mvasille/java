package java4prac.seasons;

// Main.java
public class Main {
    public static void main(String[] args) {
        Seasons любимоеВремяГода = Seasons.ЛЕТО;
        System.out.println("Мое любимое время года: " + любимоеВремяГода);
        System.out.println("Средняя температура: " + любимоеВремяГода.getСредняяТемпература());
        System.out.println("Описание: " + любимоеВремяГода.getDescription());

        printSeasonInfo(любимоеВремяГода);


        for (Seasons сезон : Seasons.values()) {
            System.out.println(сезон + " - " + сезон.getСредняяТемпература() + " градусов - " + сезон.getDescription());
        }
    }

    public static void printSeasonInfo(Seasons сезон) {
        switch (сезон) {
            case ВЕСНА:
                System.out.println("Я люблю весну");
                break;
            case ЛЕТО:
                System.out.println("Я люблю лето");
                break;
            case ОСЕНЬ:
                System.out.println("Я люблю осень");
                break;
            case ЗИМА:
                System.out.println("Я люблю зиму");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }
}

