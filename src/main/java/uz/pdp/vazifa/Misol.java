package uz.pdp.vazifa;

import java.util.Random;
import java.util.concurrent.*;

public class Misol {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callable = () -> new Random().nextInt(1, 100);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 500; i++) {
            int f = i;
            Future<Integer> submit = executorService.submit(() -> new Random().nextInt(1, 100));
            System.out.println(i + " :: " + submit.get());
        }
        executorService.close();
    }
}
