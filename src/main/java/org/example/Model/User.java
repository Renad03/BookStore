package org.example.Model;
import org.bson.Document;


public class User {
    private String id;
    private String username;
    private String password;
    private String address;
    private  String phoneNumber;
    private String email;

    // Constructors, getters, and setters
    public User(String username, String password, String phoneNumber, String address, String email) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{name='" + getUsername() + "', email='" + getEmail() + "'}";
    }

    public Document toDocument() {
        return new Document("id", id)
                .append("username", username)
                .append("password", password)
                .append("phoneNumber", phoneNumber)
                .append("address", address)
                .append("email", email);
    }

    public static User fromDocument(Document doc) {
        return new User(
                doc.getString("username"),
                doc.getString("password"),
                doc.getString("phoneNumber"),
                doc.getString("address"),
                doc.getString("email")
        );
    }
}