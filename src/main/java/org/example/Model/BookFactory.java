package org.example.Model;

import org.example.Model.Categorie;
import org.example.Model.Historical;

public class BookFactory {
    public Categorie getCategorie(String Categorie_type)
    {
        if(Categorie_type==null)
        {
            return null;
        }
        if(Categorie_type.equalsIgnoreCase ("Historical"))
        {
            return new Historical();
        }
        return null;
    }
}