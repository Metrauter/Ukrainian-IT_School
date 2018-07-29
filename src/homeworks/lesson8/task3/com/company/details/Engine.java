package homeworks.lesson8.task3.com.company.details;

public class Engine {
    double power;
    String producer;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Engine(double power, String producer) {
        this.power = power;
        this.producer = producer;
    }
}
