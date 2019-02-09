package pl.sdacademy.mongo.main;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import pl.sdacademy.mongo.data.DataOperations;
import pl.sdacademy.mongo.utlis.MongoUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Robot {


    public static void main(String[] args) {
        MongoCollection<org.bson.Document> found = MongoUtils
                .getInstance()
                .getClient()
                .getDatabase("pages")
                .getCollection("found");
        String searchText = "Rzeszów";

        HashSet<String> urlToSearch = new HashSet<String>();
        urlToSearch.add("htttp://onet.pl");

        HashSet<String> urlUsed = new HashSet<String>();

        Iterator<String> iterator = urlToSearch.iterator();

        while (iterator.hasNext()) {
            String url = iterator.next();

            if (urlUsed.contains(url) == false) {
                urlUsed.add(url);

                try {
                    System.out.println("Szukanie w : " + url);

                    Document page = Jsoup.connect(url)
                            .followRedirects(true)
                            .get();
                    String content = page.text();
                    if (content.contains(searchText)) {

                    }
                } catch (IOException e) {
                    System.out.println("błąd: " + url);
                }


            }
        }
    }
}
