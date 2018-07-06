package classworks.lesson6;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone Phone1 = new Phone("LG", "0678269585", 154.3);
        Phone Phone2 = new Phone("Nokia", "0678269585");
        Phone Phone3 = new Phone();

        System.out.println("Model: " + Phone1.getModel());
        System.out.println("Number: " + Phone1.getNumber());
        System.out.println("Weight: " + Phone1.getWeight());

        Phone1.receiveCall("мама");
        System.out.println(Phone1.getNumber());
        Phone1.receiveCall("Мама ", "0678269585");
        Phone1.sendMessage("0678269585");
    }
}