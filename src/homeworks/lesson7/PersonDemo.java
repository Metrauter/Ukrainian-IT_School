package homeworks.lesson7;

public class PersonDemo {
    public static void main(String[] args) {
        Person Person1 = new Person("Serhii Lazarenko ", 26);
        Person Person2 = new Person("Andrii Petrenko ", 24);
        Person Person3 = new Person("Viktor Gordiev ", 31);

        Person1.move("Serhii Lazarenko");
        Person2.move(Person2.getFullName());
        Person3.move(Person3.getFullName());
    }
}
