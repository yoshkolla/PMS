package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UseCycle generated by hbm2java
 */
public class UseCycle  implements java.io.Serializable {


     private Integer iduseCycle;
     private String name;
     private Double tabsPerDate;
     private Integer status;
     private Set prescriptionItems = new HashSet(0);

    public UseCycle() {
    }

    public UseCycle(String name, Double tabsPerDate, Integer status, Set prescriptionItems) {
       this.name = name;
       this.tabsPerDate = tabsPerDate;
       this.status = status;
       this.prescriptionItems = prescriptionItems;
    }
   
    public Integer getIduseCycle() {
        return this.iduseCycle;
    }
    
    public void setIduseCycle(Integer iduseCycle) {
        this.iduseCycle = iduseCycle;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Double getTabsPerDate() {
        return this.tabsPerDate;
    }
    
    public void setTabsPerDate(Double tabsPerDate) {
        this.tabsPerDate = tabsPerDate;
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


