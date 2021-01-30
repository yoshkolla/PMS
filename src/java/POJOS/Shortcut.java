package POJOS;
// Generated Jan 30, 2021 12:28:20 PM by Hibernate Tools 4.3.1



/**
 * Shortcut generated by hbm2java
 */
public class Shortcut  implements java.io.Serializable {


     private Integer idshortcut;
     private User user;
     private String name;
     private String url;
     private Integer status;

    public Shortcut() {
    }

	
    public Shortcut(User user) {
        this.user = user;
    }
    public Shortcut(User user, String name, String url, Integer status) {
       this.user = user;
       this.name = name;
       this.url = url;
       this.status = status;
    }
   
    public Integer getIdshortcut() {
        return this.idshortcut;
    }
    
    public void setIdshortcut(Integer idshortcut) {
        this.idshortcut = idshortcut;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


