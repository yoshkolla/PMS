package POJOS;
// Generated Apr 20, 2021 10:27:05 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UseMethod generated by hbm2java
 */
public class UseMethod  implements java.io.Serializable {


     private Integer iduseMethod;
     private String name;
     private Integer status;
     private Set prescriptionItems = new HashSet(0);

    public UseMethod() {
    }

    public UseMethod(String name, Integer status, Set prescriptionItems) {
       this.name = name;
       this.status = status;
       this.prescriptionItems = prescriptionItems;
    }
   
    public Integer getIduseMethod() {
        return this.iduseMethod;
    }
    
    public void setIduseMethod(Integer iduseMethod) {
        this.iduseMethod = iduseMethod;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getPrescriptionItems() {
        return this.prescriptionItems;
    }
    
    public void setPrescriptionItems(Set prescriptionItems) {
        this.prescriptionItems = prescriptionItems;
    }




}


