package org.example.Model;

import org.bson.Document;

public class Admin extends User
{

    public Admin(String username, String password, String phoneNumber, String address, String email) {
        super (username, password, phoneNumber, address, email);
    }

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

    public static Admin fromDocument(Document doc) {
        Admin admin=new Admin ( doc.getString("username"),
                doc.getString("password"),
                doc.getString("phoneNumber"),
                doc.getString("address"),
                doc.getString("email"));
        return  admin;
    }
}
