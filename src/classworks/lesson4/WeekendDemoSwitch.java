package classworks.lesson4;

public class WeekendDemoSwitch {
    public static void main(String[] args) {
        String week;
        switch (args[0]) {
            case "1":
                week = "Понедельник";
                break;
            case "2":
                week = "Вторник";
                break;
            case "3":
                week = "Среда";
                break;
            case "4":
                week = "Четверг";
                break;
            case "5":
                week = "Пятница";
                break;
            case "6":
            case "7":
                week = "Выходной";
                break;
            default:
                week = "Это не день недели";
        }
        System.out.println("День недели: " + week + ".");
    }
}