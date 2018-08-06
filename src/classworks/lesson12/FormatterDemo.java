package classworks.lesson12;

public class FormatterDemo {
    public static void main(String[] args) {
        format("Петров", 95, "Математика");
    }

    public static void format(String name, int score, String lesson) {
        System.out.printf("Студент %15s получил %3d по %10s.", name, score, lesson);
    }
}
