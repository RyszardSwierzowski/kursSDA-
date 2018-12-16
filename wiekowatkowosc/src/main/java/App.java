public class App {




    public static void main(String[] args) {
        String nazwaWatku = Thread.currentThread().getName();// nazwa obecnego wątku
        //System.out.println(nazwaWatku);

        /*
            Uruchomienie wątku
         */
        Thread thread = new Thread(new Async());
            thread.start();
        Thread thread1 = new Async2();
            thread1.start();


    }

    /*
            TWORZENIE WATKÓW
     */

    // opcja 1
    private static  class Async implements Runnable{


        public void run() {
            System.out.println("moj nowy wątek Async :" + Thread.currentThread().getName());
            for(int i =0;i<10;i++){
                System.out.println("Hello world from super new Thread");
            }
        }
    }
    // opcja 2
    private static class Async2 extends Thread{
        public void run(){
            System.out.println("moj nowy wątek Async2:" + Thread.currentThread().getName());
            for(int i =0;i<10;i++){
                System.out.println("Hello world");
            }
        }
    }

}
