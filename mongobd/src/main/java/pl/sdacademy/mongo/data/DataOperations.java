package pl.sdacademy.mongo.data;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.types.ObjectId;
import pl.sdacademy.mongo.entity.TestEntity;
import pl.sdacademy.mongo.utlis.MongoUtils;

import java.util.ArrayList;
import java.util.List;


public class DataOperations {

    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public DataOperations(String dataBaseName, String collectionName) {
        database = MongoUtils.getInstance()
                .getClient()
                .getDatabase(dataBaseName);

        collection = database.getCollection(collectionName);

    }

    public void insertData(TestEntity testEntity) {
        Document doc = new Document("text", testEntity.getText())
                .append("number", testEntity.getNumber())
                .append("date", testEntity.getDate());

        collection.insertOne(doc);
        testEntity.setId(doc.getObjectId("_id").toString());
    }

    public TestEntity getData(String id) {

        FindIterable<Document> result = collection.find(Filters.eq("_id", new ObjectId(id)));
        if (result.iterator().hasNext()) {
            Document doc = result.iterator().next();

            TestEntity entity = new TestEntity();
            entity.setText(doc.getString("text"));
            entity.setNumber(doc.getInteger("number"));
            entity.setDate(doc.getDate("date"));
            entity.setId(doc.getObjectId("_id").toString());

            return entity;
        }
        return null;
    }

    // todo zaaktualizować projekt od innej osoby

    public void insertMany(List<TestEntity> items) {
        ArrayList<Document> insertList = new ArrayList();
        for (TestEntity entity : items) {
            Document doc = new Document("text", entity.getText())
                    .append("number", entity.getNumber())
                    .append("date", entity.getDate());
            insertList.add(doc);
        }
        collection.insertMany(insertList);

    }

    public List<TestEntity> findRange(Integer lower, Integer upper) {

        FindIterable<Document> result = collection.find(Filters.and(Filters.gte("number", lower), Filters.lte("number", upper)));
        MongoCursor<Document> iterator = result.iterator();
        ArrayList<TestEntity> list = new ArrayList();

        while (iterator.hasNext()) {
            Document doc = result.iterator().next();

            TestEntity entity = new TestEntity();
            entity.setText(doc.getString("text"));
            entity.setNumber(doc.getInteger("number"));
            entity.setDate(doc.getDate("date"));
            entity.setId(doc.getObjectId("_id").toString());
            list.add(entity);
        }
        return list;
    }

    public void update(TestEntity entity) {
        collection.updateOne(Filters.eq("_id", new ObjectId(entity.getId())),
                Updates.combine(
                        Updates.set("text", entity.getText()),
                        Updates.set("number", entity.getNumber()),
                        Updates.set("date", entity.getDate())
                ));
    }
}
