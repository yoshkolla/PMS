package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1



/**
 * ItemThird generated by hbm2java
 */
public class ItemThird  implements java.io.Serializable {


     private Integer iditemThird;
     private Items items;
     private ThirdCategory thirdCategory;

    public ItemThird() {
    }

    public ItemThird(Items items, ThirdCategory thirdCategory) {
       this.items = items;
       this.thirdCategory = thirdCategory;
    }
   
    public Integer getIditemThird() {
        return this.iditemThird;
    }
    
    public void setIditemThird(Integer iditemThird) {
        this.iditemThird = iditemThird;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public ThirdCategory getThirdCategory() {
        return this.thirdCategory;
    }
    
    public void setThirdCategory(ThirdCategory thirdCategory) {
        this.thirdCategory = thirdCategory;
    }




}


