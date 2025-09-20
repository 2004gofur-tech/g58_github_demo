package uz.pdp;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
                    return new Random().nextInt(100);
                }).thenApply(integer -> integer + 1000)
                .thenAccept(System.out::println)
                .thenRun(() -> {
                    System.out.println("Tugadiiii.....");
                });
        Thread.sleep(500);
    }
}
