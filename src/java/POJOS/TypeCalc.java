package POJOS;
// Generated Jan 30, 2021 12:28:20 PM by Hibernate Tools 4.3.1



/**
 * TypeCalc generated by hbm2java
 */
public class TypeCalc  implements java.io.Serializable {


     private Integer idtypeCalc;
     private Items items;
     private Type typeByType2;
     private Type typeByType1;
     private String formula;

    public TypeCalc() {
    }

	
    public TypeCalc(Items items, Type typeByType2, Type typeByType1) {
        this.items = items;
        this.typeByType2 = typeByType2;
        this.typeByType1 = typeByType1;
    }
    public TypeCalc(Items items, Type typeByType2, Type typeByType1, String formula) {
       this.items = items;
       this.typeByType2 = typeByType2;
       this.typeByType1 = typeByType1;
       this.formula = formula;
    }
   
    public Integer getIdtypeCalc() {
        return this.idtypeCalc;
    }
    
    public void setIdtypeCalc(Integer idtypeCalc) {
        this.idtypeCalc = idtypeCalc;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public Type getTypeByType2() {
        return this.typeByType2;
    }
    
    public void setTypeByType2(Type typeByType2) {
        this.typeByType2 = typeByType2;
    }
    public Type getTypeByType1() {
        return this.typeByType1;
    }
    
    public void setTypeByType1(Type typeByType1) {
        this.typeByType1 = typeByType1;
    }
    public String getFormula() {
        return this.formula;
    }
    
    public void setFormula(String formula) {
        this.formula = formula;
    }




}


