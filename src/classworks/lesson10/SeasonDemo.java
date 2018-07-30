package classworks.lesson10;

public class SeasonDemo {

    public static void main(String[] args) {
        Seasons seasons = Seasons.SPRING;
        if (seasons == Seasons.SPRING) {
            System.out.println(seasons);
        }
        print(seasons);
        print(Seasons.SPRING);
        val();
        System.out.println(seasons.getDescription());
        System.out.println(seasons.getTemprature());
    }

    public static void print(Seasons season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            default:
                System.out.println("Время года не выбрано");
        }
    }

    public static void val() {
        System.out.println("Константы перечислимого типа season");
        Seasons[] seasons = Seasons.values();
        for (Seasons c : seasons) {
            System.out.println(c);
        }
        System.out.println();
        Seasons season = Seasons.valueOf("SPRING");
        System.out.println("Переменная season содержит " + season);
    }
}