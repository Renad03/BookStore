package org.example.Database;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import org.example.Model.User;
import java.util.ArrayList;
import java.util.List;
public class UserDB {
    public static UserDB userdb;
    Database userDataBase = Database.getInstance();
    private final MongoCollection<Document> userCollection;
    private UserDB() {
        this.userCollection = userDataBase.getCollection("user");
    }

    public static UserDB getInstance() {
        if (userdb == null) {
            System.out.println("Creating user database aho");
            userdb = new UserDB();
        }
        return userdb;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (Document doc : userCollection.find()) {
            users.add(User.fromDocument(doc));
        }
        return users;
    }

    public void createUser(User user) {
        userCollection.insertOne(user.toDocument());
    }
}
