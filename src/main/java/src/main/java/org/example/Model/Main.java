package src.main.java.org.example.Model;

import org.example.Database.CRUD;
import org.example.Model.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CRUD<User>  userCRUD = new CRUD<>("user", User.class);
        User user1 = User.login ("malak", "123456");
        // userCRUD.createItem(user1);
        //userCRUD.deleteItem (user1);
        // user1.login ("Farida", "123456");
        System.out.println (user1.getPassword ());
    }
}