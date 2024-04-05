import java.io.*;

class A extends Thread{
    public void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Good Morning");
                try {
                    sleep(1000);
                } catch (Exception e) {

                }
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Good Aftenoon");
                try {
                    sleep(3000);
                } catch (Exception e) {

                }
            }
        }
    }
}

public class Lab9_1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();

    }
}