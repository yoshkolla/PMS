package POJOS;
// Generated Apr 20, 2021 10:27:05 PM by Hibernate Tools 4.3.1



/**
 * BodyMeasurement generated by hbm2java
 */
public class BodyMeasurement  implements java.io.Serializable {


     private Integer idbodyMeasurement;
     private Patient patient;
     private Double weight;
     private Double height;
     private String date;
     private String time;
     private Integer status;

    public BodyMeasurement() {
    }

	
    public BodyMeasurement(Patient patient) {
        this.patient = patient;
    }
    public BodyMeasurement(Patient patient, Double weight, Double height, String date, String time, Integer status) {
       this.patient = patient;
       this.weight = weight;
       this.height = height;
       this.date = date;
       this.time = time;
       this.status = status;
    }
   
    public Integer getIdbodyMeasurement() {
        return this.idbodyMeasurement;
    }
    
    public void setIdbodyMeasurement(Integer idbodyMeasurement) {
        this.idbodyMeasurement = idbodyMeasurement;
    }
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getHeight() {
        return this.height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


