package org.example.Model;
import org.bson.Document;
import org.example.Database.UserCRUD;


public class User {
    String id;
    String username;
    String password;
    String address;
    String phoneNumber;
    String email;
     static UserCRUD userCRUD = new UserCRUD();
   static User user;

    // Constructors, getters, and setters
    public User(String username, String password, String phoneNumber, String address, String email) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public User() {
        // No-argument constructor
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
        return "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' ;
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
       User user2=new User ( doc.getString("username"),
               doc.getString("password"),
               doc.getString("phoneNumber"),
               doc.getString("address"),
               doc.getString("email"));
        return  user2;
    }
    public static User login(String enteredUsername)
    {
        User userr = null;
        userr = userCRUD.getUserByUsername(enteredUsername);
        if (userr!=null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
       return userr;
    }
}