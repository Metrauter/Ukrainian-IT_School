package classworks.lesson24;

public class NewRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Run by " + Thread.currentThread().getName());
    }
}
