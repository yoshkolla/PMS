package POJOS;
// Generated Jan 28, 2021 9:31:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MealType generated by hbm2java
 */
public class MealType  implements java.io.Serializable {


     private Integer idmealType;
     private String name;
     private Integer status;
     private Set prescriptionItems = new HashSet(0);

    public MealType() {
    }

    public MealType(String name, Integer status, Set prescriptionItems) {
       this.name = name;
       this.status = status;
       this.prescriptionItems = prescriptionItems;
    }
   
    public Integer getIdmealType() {
        return this.idmealType;
    }
    
    public void setIdmealType(Integer idmealType) {
        this.idmealType = idmealType;
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


