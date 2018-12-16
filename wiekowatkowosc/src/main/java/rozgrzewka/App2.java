package rozgrzewka;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {



    public static void main(String[] args) {
        System.out.println("moj nowy watek:" + Thread.currentThread().getName());
        ExecutorService es = Executors.newFixedThreadPool(1); // liczba nowych watkwo do przygotowania
        es.execute(()-> {
            System.out.println("moj nowy wątek Async :" + Thread.currentThread().getName());
            for(int i =0;i<10;i++){
                System.out.println("Hello world from super new Thread");
            }
        });
        es.shutdown();
    }
}
