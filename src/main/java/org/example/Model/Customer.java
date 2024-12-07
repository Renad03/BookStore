package org.example.Model;


import java.util.ArrayList;
import java.util.Scanner;
public class Customer {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<String> orderHistory = new ArrayList<> ();
    ArrayList<String> Cart = new ArrayList<> ();
    Scanner scanner = new Scanner(System.in);

        // Method to search books by title
        public String searchBooks() {
            System.out.println("Enter the book you want:");
            String bookName = scanner.nextLine();
            boolean found = false;

            for (Book book : books) { // Iterate over books
                if (book.getTitle().equalsIgnoreCase(bookName)) {
                    System.out.println("Book found: " + book.getTitle());
                    found = true;
                    return book.getTitle(); // Return the title if found
                }
            }

            if (!found) {
                System.out.println("The book you entered is not found.");
            }

            return null; // Return null if not found
        }
    public void addtocart(){
        String book= searchBooks();
        Cart.add(book);
    }

}
