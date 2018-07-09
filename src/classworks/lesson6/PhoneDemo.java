package classworks.lesson6;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("LG", "0678269585", 154.3);
        Phone phone2 = new Phone("Nokia", "0678269585");
        Phone phone3 = new Phone();

        System.out.println("Model: " + phone1.getModel());
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Weight: " + phone1.getWeight());

        phone1.receiveCall("мама");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Мама ", "0678269585");
        phone1.sendMessage("0678269585");

        System.out.println(Phone.getCountInstance());
    }
}