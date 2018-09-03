package classworks.lesson20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeHorse {
    public static void main(String[] args) {
        Halter halter = new Halter(21);
        Horse horse = new Horse(halter);
        serialize(horse);
        Horse deserelizedHorse = deSerialize();
        System.out.println(horse.equals(deserelizedHorse));

    }

    private static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("horse.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Horse deSerialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream("horse.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }
}