package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1



/**
 * Settings generated by hbm2java
 */
public class Settings  implements java.io.Serializable {


     private int idsettings;
     private String name;
     private String mobile;
     private String fax;
     private String email;
     private String address;
     private String image;

    public Settings() {
    }

	
    public Settings(int idsettings) {
        this.idsettings = idsettings;
    }
    public Settings(int idsettings, String name, String mobile, String fax, String email, String address, String image) {
       this.idsettings = idsettings;
       this.name = name;
       this.mobile = mobile;
       this.fax = fax;
       this.email = email;
       this.address = address;
       this.image = image;
    }
   
    public int getIdsettings() {
        return this.idsettings;
    }
    
    public void setIdsettings(int idsettings) {
        this.idsettings = idsettings;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }




}


