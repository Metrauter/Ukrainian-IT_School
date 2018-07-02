package classworks.lesson4;

public class WeekendDemo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String week;
        if (n == 1) {
            week = "Понедельник";
        } else if (n == 2) {
            week = "Вторник";
        } else if (n == 3) {
            week = "Среда";
        } else if (n == 4) {
            week = "Четверг";
        } else if (n == 5) {
            week = "Пятница";
        } else if (n == 6 || n == 7) {
            week = "Выходной";
        } else {
            week = "Это не день недели";
        }
        System.out.println("День недели: " + week + ".");
    }
}
