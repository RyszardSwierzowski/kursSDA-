package rozgrzewka;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AppTwoThredsInThisSameTime {


    private static int sum = 0;
    private static AtomicInteger sumAtomic = new AtomicInteger(0);




    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(()->{
            for(int i=0;i<1000000;i++){
                sum++;
                sumAtomic.incrementAndGet();
            }
        });
        es.execute(()->{
            for(int i=0;i<1000000;i++){
                sum--;
                sumAtomic.decrementAndGet();
            }
        });
        es.awaitTermination(2, TimeUnit.SECONDS); // poczekaj max 2 sek na zakończenie wątków
        es.shutdown();
        System.out.println("Zwykły int "+sum);
        System.out.println("Atomic "+sumAtomic);
    }
}
