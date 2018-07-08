package homeworks.lesson7;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this("", 0);
    }

    public Person(String fullName) {
        this(fullName, 0);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move(String fullName) {
        System.out.println("Person: " + fullName + " is moving!");
    }
}