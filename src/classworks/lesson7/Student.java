package classworks.lesson7;

public class Student {

    private String firstName, lastName, group;
    double avarageMark;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAvarageMark(double avarageMark) {
        this.avarageMark = avarageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAvarageMark() {
        return avarageMark;
    }

    public Student(String firstName, String lastName, String group, double avarageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avarageMark = avarageMark;
    }

    public int getScholarship() {
        if (getAvarageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
