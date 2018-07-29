package homeworks.lesson10.task2;

public class InstrumentDemo {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(1);
        Drum drum1 = new Drum(2);
        Chimney chimney1 = new Chimney(3);

        Instrument[] instruments = {guitar1, drum1, chimney1};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
