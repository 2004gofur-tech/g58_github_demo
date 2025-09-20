package uz.pdp.vazifa;


import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);

        Runnable tack = () -> {
                try {
                    System.out.println(new Date());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };

        executorService.scheduleWithFixedDelay(
                tack,
                1,
                1,
                TimeUnit.SECONDS);
//        executorService.scheduleAtFixedRate(
//                tack,
//                1,
//                1,
//                TimeUnit.SECONDS
//        );

//        executorService.shutdownNow();
//        Thread.sleep(12000);
//        executorService.shutdown();
//        executorService.close();
    }

}
