package zapychaczeCzasu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Sandbox1
{
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        LocalDateTime end = LocalDateTime.now();


        int time = end.toLocalTime().toSecondOfDay() - now.toLocalTime().toSecondOfDay();
        System.out.println(time);
    }

//    private static List pobierzListe()
//    {
//        Path path = Paths.get("src\\main\\java\\zapychaczeCzasu\\sandbox1.txt");
////        Files.read
//    }

}
