package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Patient generated by hbm2java
 */
public class Patient  implements java.io.Serializable {


     private Integer idpatient;
     private User user;
     private String name;
     private String birthDay;
     private String gender;
     private String bloodGroup;
     private String address;
     private String contactNo;
     private String nic;
     private String regDate;
     private String regTime;
     private String note;
     private String lastUpdateDate;
     private String lastUpdateTime;
     private Integer status;
     private Set prescriptions = new HashSet(0);
     private Set patientTokens = new HashSet(0);
     private Set bodyMeasurements = new HashSet(0);

    public Patient() {
    }

	
    public Patient(User user) {
        this.user = user;
    }
    public Patient(User user, String name, String birthDay, String gender, String bloodGroup, String address, String contactNo, String nic, String regDate, String regTime, String note, String lastUpdateDate, String lastUpdateTime, Integer status, Set prescriptions, Set patientTokens, Set bodyMeasurements) {
       this.user = user;
       this.name = name;
       this.birthDay = birthDay;
       this.gender = gender;
       this.bloodGroup = bloodGroup;
       this.address = address;
       this.contactNo = contactNo;
       this.nic = nic;
       this.regDate = regDate;
       this.regTime = regTime;
       this.note = note;
       this.lastUpdateDate = lastUpdateDate;
       this.lastUpdateTime = lastUpdateTime;
       this.status = status;
       this.prescriptions = prescriptions;
       this.patientTokens = patientTokens;
       this.bodyMeasurements = bodyMeasurements;
    }
   
    public Integer getIdpatient() {
        return this.idpatient;
    }
    
    public void setIdpatient(Integer idpatient) {
        this.idpatient = idpatient;
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
    public String getBirthDay() {
        return this.birthDay;
    }
    
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getBloodGroup() {
        return this.bloodGroup;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    public String getRegTime() {
        return this.regTime;
    }
    
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public String getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
    public Set getPatientTokens() {
        return this.patientTokens;
    }
    
    public void setPatientTokens(Set patientTokens) {
        this.patientTokens = patientTokens;
    }
    public Set getBodyMeasurements() {
        return this.bodyMeasurements;
    }
    
    public void setBodyMeasurements(Set bodyMeasurements) {
        this.bodyMeasurements = bodyMeasurements;
    }




}


