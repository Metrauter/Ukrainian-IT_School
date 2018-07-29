package homeworks.lesson8.task3.com.company.vehicles;

import homeworks.lesson8.task3.com.company.details.Engine;
import homeworks.lesson8.task3.com.company.professions.Driver;

public class Car {
    String model, type;
    double weight;
    Driver driver1 = new Driver("Пупенко Виктор Владимирович", 2);
    Engine engine1 = new Engine(234,"Jaguar");

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}
