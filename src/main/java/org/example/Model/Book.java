package src.main.java.org.example.Model;

import java.util.ArrayList;
public class Book  {
    private String title,author;
    private float stock,price,rating;
    private String categorie_Type;
    ArrayList<Book> books = new ArrayList<>();

    // Setters for modifying attributes
    public void setStock(float stock)
    {
        this.stock = stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }

    public String getCategorie_Type() {
        return categorie_Type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setRating(float rating)
    {
        this.rating = rating;
    }
    public void setCategorie_Type(String categorie_Type) {
        this.categorie_Type = categorie_Type;
    }
    public void displayBookDetails()
    {
        System.out.println ("Title: " + title);
        System.out.println ("Author: " + author);
        System.out.println ("Stock: " + stock);
        System.out.println ("Price: $" + price);
        System.out.println ("Rating: " + rating + " stars");
    }

}
