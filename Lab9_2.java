import java.io.*;

public class Lab9_2 {
    public static void main(String[] args) {
        Thread O = new Thread(new Odd());
        Thread E = new Thread(new Even());
        E.start();
        O.start();

    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread : " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class Even implements Runnable {
    public void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread : " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
