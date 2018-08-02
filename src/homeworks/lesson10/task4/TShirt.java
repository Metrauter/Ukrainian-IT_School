package homeworks.lesson10.task4;

public class TShirt extends Cloth implements ManCloth, WomanCloth {
    @Override
    public void clotheMan() {
        System.out.println("Одеваем футболку на мужчину");
    }

    @Override
    public void clotheWoman() {
        System.out.println("Одеваем футболку на женщину");
    }
}
