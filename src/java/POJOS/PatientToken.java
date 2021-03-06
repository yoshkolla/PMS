package POJOS;
// Generated Apr 20, 2021 10:27:05 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PatientToken generated by hbm2java
 */
public class PatientToken  implements java.io.Serializable {


     private Integer idpatientToken;
     private Patient patient;
     private Integer tokenNumber;
     private String date;
     private String time;
     private Integer status;
     private Set prescriptions = new HashSet(0);

    public PatientToken() {
    }

	
    public PatientToken(Patient patient) {
        this.patient = patient;
    }
    public PatientToken(Patient patient, Integer tokenNumber, String date, String time, Integer status, Set prescriptions) {
       this.patient = patient;
       this.tokenNumber = tokenNumber;
       this.date = date;
       this.time = time;
       this.status = status;
       this.prescriptions = prescriptions;
    }
   
    public Integer getIdpatientToken() {
        return this.idpatientToken;
    }
    
    public void setIdpatientToken(Integer idpatientToken) {
        this.idpatientToken = idpatientToken;
    }
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
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
    public Set getPrescriptions() {
        return this.prescriptions;
    }
    
    public void setPrescriptions(Set prescriptions) {
        this.prescriptions = prescriptions;
    }




}


