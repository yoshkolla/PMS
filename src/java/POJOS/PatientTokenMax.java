package POJOS;
// Generated Apr 20, 2021 10:27:05 PM by Hibernate Tools 4.3.1



/**
 * PatientTokenMax generated by hbm2java
 */
public class PatientTokenMax  implements java.io.Serializable {


     private Integer idpatientTokenMax;
     private Integer tokenNumber;
     private String date;

    public PatientTokenMax() {
    }

    public PatientTokenMax(Integer tokenNumber, String date) {
       this.tokenNumber = tokenNumber;
       this.date = date;
    }
   
    public Integer getIdpatientTokenMax() {
        return this.idpatientTokenMax;
    }
    
    public void setIdpatientTokenMax(Integer idpatientTokenMax) {
        this.idpatientTokenMax = idpatientTokenMax;
    }
    public Integer getTokenNumber() {
        return this.tokenNumber;
    }
    
    public void setTokenNumber(Integer tokenNumber) {
        this.tokenNumber = tokenNumber;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }




}


