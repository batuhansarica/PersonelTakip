package model;


public class Admin {
    public static void main(String[] args) {
         
     }
    
    private String kadi;
    private String password;
    
     public Admin() {}
     
     public Admin(String kadi, String password) {
        super();
        this.kadi = kadi;
        this.password = password;
    }

  
    public String getKadi() {
        return kadi;
    }

   
    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
     
     
     
     
     
     
     
     
     
}
