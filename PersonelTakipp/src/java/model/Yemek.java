package model;


public class Yemek {
    public static void main(String[] args) {
         
     }
    
    private String gun;
    private String corba;
    private String anayemek;
    private String anayemek2;
    
    
    public Yemek() {}
    
     public Yemek(String corba, String anayemek, String anayemek2) {
        super();
        this.corba = corba;
        this.anayemek = anayemek;
        this.anayemek2 = anayemek2;
    }
    
    public Yemek(String gun, String corba, String anayemek, String anayemek2) {
        super();
        this.gun = gun;
        this.corba = corba;
        this.anayemek = anayemek;
        this.anayemek2 = anayemek2;
    }

   
    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getCorba() {
        return corba;
    }

    public void setCorba(String corba) {
        this.corba = corba;
    }

    public String getAnayemek() {
        return anayemek;
    }

    public void setAnayemek(String anayemek) {
        this.anayemek = anayemek;
    }

    public String getAnayemek2() {
        return anayemek2;
    }

    public void setAnayemek2(String anayemek2) {
        this.anayemek2 = anayemek2;
    }
    
    
}
