package uz.pdp.atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicExample {

    private AtomicLong balance = new AtomicLong(5000);
    //static double balance = 5000;

    public void th1() {
        balance.getAndAdd(-10);
    }

    public void th2() {
        balance.getAndAdd(-25);
    }

    public AtomicLong getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample example = new AtomicExample();
        Runnable runnable1 = () -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(200);
                    example.th1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 16; i++) {
                try {
                    Thread.sleep(500);
                    example.th2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread th1 = new Thread(runnable1, "Th1");
        Thread th2 = new Thread(runnable2, "Th2");

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Balansda " + example.getBalance() + "$ qoldi");
    }
}
