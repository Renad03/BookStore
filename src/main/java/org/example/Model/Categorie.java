package org.example.Model;

import java.util.ArrayList;


public  abstract class Categorie
{
    public String Categorie_name = null;
    ArrayList<Book> books = new ArrayList<>();
    public abstract void  setcat(String Categorie_name);
}
