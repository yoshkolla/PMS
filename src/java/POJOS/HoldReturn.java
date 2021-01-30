package POJOS;
// Generated Jan 30, 2021 12:28:20 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * HoldReturn generated by hbm2java
 */
public class HoldReturn  implements java.io.Serializable {


     private Integer idholdReturn;
     private User user;
     private Double amount;
     private String date;
     private String remark;
     private Integer status;
     private String time;
     private Set holdReturnItemses = new HashSet(0);

    public HoldReturn() {
    }

	
    public HoldReturn(User user) {
        this.user = user;
    }
    public HoldReturn(User user, Double amount, String date, String remark, Integer status, String time, Set holdReturnItemses) {
       this.user = user;
       this.amount = amount;
       this.date = date;
       this.remark = remark;
       this.status = status;
       this.time = time;
       this.holdReturnItemses = holdReturnItemses;
    }
   
    public Integer getIdholdReturn() {
        return this.idholdReturn;
    }
    
    public void setIdholdReturn(Integer idholdReturn) {
        this.idholdReturn = idholdReturn;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public Set getHoldReturnItemses() {
        return this.holdReturnItemses;
    }
    
    public void setHoldReturnItemses(Set holdReturnItemses) {
        this.holdReturnItemses = holdReturnItemses;
    }




}


