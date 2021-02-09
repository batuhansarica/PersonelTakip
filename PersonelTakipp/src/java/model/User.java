/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class User {
    public static void main(String[] args) {
         
     }
    
    private int id;
    private String isim;
    private String email;
    private int telefon;

    public User() {}

    public User(String isim, String email, int telefon) {
        super();
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }

    public User(int id, String isim, String email, int telefon) {
        super();
        this.id = id;
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

}