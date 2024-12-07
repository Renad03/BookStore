package org.example.Model;
import org.bson.Document;


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

    public String getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public String getRating() {
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

    public void setRating(String rating)
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

    public String toString() {return "title"+getTitle()+"author"+getAuthor()
            +"stock"+getStock()+"price"+getPrice()+"rating"+getRating()+"category type"+getCategorie_Type();}


        public Document toDocument() {
        return new Document("title",title)
                .append("author",author)
                .append("stock",stock)
                .append("price",price)
                .append("rating",rating)
                .append("categorie_Type",categorie_Type);
    }

    public static Book fromDocument(Document doc) {
        return new Book(
                doc.getString("title"),
                doc.getString("author"),
                doc.getString("stock"),
                doc.getString("price"),
                doc.getString("rating"),
                doc.getString("categorie_Type")




        );

    }

}

