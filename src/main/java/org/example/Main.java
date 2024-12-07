package org.example;

import org.example.Database.Database;
import org.example.Database.UserDB;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UserDB usercollection = UserDB.getInstance();
        System.out.println(usercollection);
        System.out.println("All Users");
        System.out.println(usercollection.getAllUsers());
    }
}