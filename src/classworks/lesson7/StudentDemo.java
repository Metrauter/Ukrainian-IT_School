package classworks.lesson7;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Петров", "Иван", "Группа 2", 4.6, "Diploma");
        Student student2 = new Student("Коновалов", "Виктор", "Группа 1", 4.1);
        Aspirant aspirant1 = new Aspirant("Грачёв", "Владимир", "Группа 3", 5, "Diploma2");

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getAvarageMark());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getAvarageMark());
        System.out.println(aspirant1.getFirstName() + " " + aspirant1.getLastName() + " " + aspirant1.getAvarageMark() + " " + aspirant1.getScienceWork());

        Student[] students = {student1, student2, aspirant1};
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getScholarship());
        }
    }
}
