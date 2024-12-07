package org.example.Database;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class CRUD<T> {
    private final MongoCollection<Document> collection;
    private final Class<T> type;

    public CRUD(String collectionName, Class<T> type) {
        Database database = Database.getInstance();
        this.collection = database.getCollection(collectionName);
        this.type = type;
    }

    public List<T> getAllCollection() {
        List<T> items = new ArrayList<>();
        for (Document doc : collection.find()) {
            items.add(fromDocument(doc));
        }
        return items;
    }

    public void createItem(T item) {
        collection.insertOne(toDocument(item));
    }

    public void deleteItem(T item) {
        collection.deleteOne(toDocument(item));
    }

    public void updateItem(T filterItem, T updateItem) {
        collection.updateOne(
                toDocument(filterItem),
                new Document("$set", toDocument(updateItem))
        );
    }

    private Document toDocument(T item) {
        try {
            return (Document) item.getClass().getMethod("toDocument").invoke(item);
        } catch (Exception e) {
            throw new RuntimeException("Error converting item to Document: " + e.getMessage(), e);
        }
    }

    private T fromDocument(Document doc) {
        try {
            T instance = type.getDeclaredConstructor().newInstance();
            type.getMethod("fromDocument", Document.class).invoke(instance, doc);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error converting Document to item: " + e.getMessage(), e);
        }
    }
}
