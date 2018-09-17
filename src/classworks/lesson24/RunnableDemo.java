package classworks.lesson24;

public class RunnableDemo {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();

        Thread thread1 = new Thread(newRunnable);
//        thread1.setName("first");
        Thread thread2 = new Thread(newRunnable);
//        thread2.setName("second");
        Thread thread3 = new Thread(newRunnable);
//        thread3.setName("third");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
