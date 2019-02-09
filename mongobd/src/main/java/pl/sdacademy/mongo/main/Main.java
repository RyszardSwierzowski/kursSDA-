package pl.sdacademy.mongo.main;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoIterable;
import pl.sdacademy.mongo.data.DataOperations;
import pl.sdacademy.mongo.entity.TestEntity;
import pl.sdacademy.mongo.utlis.MongoUtils;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MongoIterable<String> list = MongoUtils.getInstance().getClient().listDatabaseNames();
//            for(String name: list){
//                System.out.println(name);
//            }

        //addToBase();
        //getFromBase();


//        DataOperations operations = new DataOperations("test","kolekcja" );
//        TestEntity testEntity = new TestEntity();
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<1000;i++){
//
//            testEntity.setDate(new Date());
//            testEntity.setNumber(100);
//            testEntity.setText("Rysiek");
//
//            operations.insertData(testEntity);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);


//        DataOperations operations = new DataOperations("test","kolekcja" );
//        TestEntity testEntity = new TestEntity();
//        long startTime = System.currentTimeMillis();
//        List lista = new ArrayList();
//
//        for(int i=0;i<100000;i++){
//
//            testEntity.setDate(new Date());
//            testEntity.setNumber(100);
//            testEntity.setText("Rysiek");
//            lista.add(testEntity);
//
//
//        }
//        operations.insertMany(lista);
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);





    }


    private static void addToBase(){
        DataOperations dataOperations = new DataOperations("test","kolekcja" );
        TestEntity testEntity = new TestEntity();
        testEntity.setDate(new Date());
        testEntity.setNumber(100);
        testEntity.setText("testowe wstawienie");
        dataOperations.insertData(testEntity);
    }

    private static void getFromBase(){
        DataOperations dataOperations = new DataOperations("test","kolekcja" );

        dataOperations.getData("5c5ea2b77dd64a0fe8e1a813");

    }
}
