package org.example;


import org.example.Database.CRUD;
import org.example.Model.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CRUD<User> userCRUD = new CRUD<>("user", User.class);
        User user1 = new User("Farida", "123456", "01210590271", "Cairo", "malak@gmail.com");
        userCRUD.createItem(user1);

    }
}