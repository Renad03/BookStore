package org.example.Database;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserCRUD {
    private final MongoCollection<Document> collection;

    public UserCRUD() {
        Database database = Database.getInstance();
        this.collection = database.getCollection("user");
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (Document doc : collection.find()) {
            users.add(User.fromDocument(doc));
        }
        return users;
    }

    public void createUser(User user) {
        collection.insertOne(user.toDocument());
    }

    public void deleteUser(User user) {
        collection.deleteOne(user.toDocument());
    }

    public void updateUser(User filterUser, User updateUser) {
        collection.updateOne(
                filterUser.toDocument(),
                new Document("$set", updateUser.toDocument())
        );
    }

    public User getUserByUsername(String userId) {
        Document filter = new Document("username", userId);
        return getUserByFilter(filter);
    }

    private User getUserByFilter(Document filter) {
        Document doc = collection.find(filter).first();
        return doc != null ? User.fromDocument(doc) : null;
    }
}