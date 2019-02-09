package pl.sdacademy.mongo.utlis;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoUtils {

    private static MongoUtils instance = new MongoUtils();
    private MongoClient client;
    private MongoUtils(){
        //client = MongoClients.create("mongodb://localhost");
        client = MongoClients.create("mongodb://192.168.90.101");
    }

    public static MongoUtils getInstance(){
        return instance;
    }

    public MongoClient getClient(){
        return client;
    }
}
