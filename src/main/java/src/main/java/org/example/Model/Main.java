package src.main.java.org.example.Model;

import org.example.Database.AdminCRUD;
import org.example.Database.BookCRUD;
import org.example.Database.UserCRUD;
import org.example.Model.Book;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BookCRUD bookCrud = new BookCRUD();
        UserCRUD userCRUD = new UserCRUD();
        System.out.println(userCRUD.getAllUsers());
        //Book book = new Book("Maths Book", "Elmoasser", "15", "150LE", "8","Studying");
        System.out.println(bookCrud.getBookByCategory("personal"));
    }
}