package classworks.lesson7;

public class Aspirant extends Student {
    private String scienceWork;

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public Aspirant(String firstName, String lastName, String group, double avarageMark, String scienceWork) {
        super(firstName, lastName, group, avarageMark);

        this.scienceWork = scienceWork;
    }

    public int getScholarship() {
        if (getAvarageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}