package POJOS;
// Generated Jan 19, 2021 12:56:26 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PurchaseInvoiceOrder generated by hbm2java
 */
public class PurchaseInvoiceOrder  implements java.io.Serializable {


     private Integer idpurchaseInvoiceOrder;
     private Account account;
     private Branch branch;
     private User user;
     private Double total;
     private String poDate;
     private String remarks;
     private Integer status;
     private String date;
     private String time;
     private Set purchusInvoices = new HashSet(0);
     private Set poOrderItemses = new HashSet(0);

    public PurchaseInvoiceOrder() {
    }

	
    public PurchaseInvoiceOrder(Account account, Branch branch, User user) {
        this.account = account;
        this.branch = branch;
        this.user = user;
    }
    public PurchaseInvoiceOrder(Account account, Branch branch, User user, Double total, String poDate, String remarks, Integer status, String date, String time, Set purchusInvoices, Set poOrderItemses) {
       this.account = account;
       this.branch = branch;
       this.user = user;
       this.total = total;
       this.poDate = poDate;
       this.remarks = remarks;
       this.status = status;
       this.date = date;
       this.time = time;
       this.purchusInvoices = purchusInvoices;
       this.poOrderItemses = poOrderItemses;
    }
   
    public Integer getIdpurchaseInvoiceOrder() {
        return this.idpurchaseInvoiceOrder;
    }
    
    public void setIdpurchaseInvoiceOrder(Integer idpurchaseInvoiceOrder) {
        this.idpurchaseInvoiceOrder = idpurchaseInvoiceOrder;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getPoDate() {
        return this.poDate;
    }
    
    public void setPoDate(String poDate) {
        this.poDate = poDate;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
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
    public Set getPurchusInvoices() {
        return this.purchusInvoices;
    }
    
    public void setPurchusInvoices(Set purchusInvoices) {
        this.purchusInvoices = purchusInvoices;
    }
    public Set getPoOrderItemses() {
        return this.poOrderItemses;
    }
    
    public void setPoOrderItemses(Set poOrderItemses) {
        this.poOrderItemses = poOrderItemses;
    }




}


