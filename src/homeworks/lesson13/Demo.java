package homeworks.lesson13;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Грачёв Василий Петрович", 3500),
                new Employee("Кузьмич Гоша Генадиевич", 4000),
                new Employee("Кузнецов Виталий Владимирович", 4150),
                new Employee("Афанасьев Виктор Маркович", 3200),
                new Employee("Канарейкин Борис Моисеев", 3700),
        };

        FullReport.generateReport(employees);
    }
}
