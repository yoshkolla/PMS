package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1



/**
 * PurchusInvoiceRecipt generated by hbm2java
 */
public class PurchusInvoiceRecipt  implements java.io.Serializable {


     private Integer idinvoiceRecipt;
     private Account accountBySupplier;
     private Account accountByBank;
     private Branch branch;
     private PaymentType paymentType;
     private PurchusInvoice purchusInvoice;
     private User user;
     private Double amount;
     private String cheNumber;
     private String cheRegDate;
     private String cheDate;
     private Double cheAmount;
     private Integer status;
     private Integer cheStatus;
     private String date;
     private String chequeBranch;
     private String remarks;
     private String time;

    public PurchusInvoiceRecipt() {
    }

	
    public PurchusInvoiceRecipt(Account accountBySupplier, Branch branch, PaymentType paymentType, User user) {
        this.accountBySupplier = accountBySupplier;
        this.branch = branch;
        this.paymentType = paymentType;
        this.user = user;
    }
    public PurchusInvoiceRecipt(Account accountBySupplier, Account accountByBank, Branch branch, PaymentType paymentType, PurchusInvoice purchusInvoice, User user, Double amount, String cheNumber, String cheRegDate, String cheDate, Double cheAmount, Integer status, Integer cheStatus, String date, String chequeBranch, String remarks, String time) {
       this.accountBySupplier = accountBySupplier;
       this.accountByBank = accountByBank;
       this.branch = branch;
       this.paymentType = paymentType;
       this.purchusInvoice = purchusInvoice;
       this.user = user;
       this.amount = amount;
       this.cheNumber = cheNumber;
       this.cheRegDate = cheRegDate;
       this.cheDate = cheDate;
       this.cheAmount = cheAmount;
       this.status = status;
       this.cheStatus = cheStatus;
       this.date = date;
       this.chequeBranch = chequeBranch;
       this.remarks = remarks;
       this.time = time;
    }
   
    public Integer getIdinvoiceRecipt() {
        return this.idinvoiceRecipt;
    }
    
    public void setIdinvoiceRecipt(Integer idinvoiceRecipt) {
        this.idinvoiceRecipt = idinvoiceRecipt;
    }
    public Account getAccountBySupplier() {
        return this.accountBySupplier;
    }
    
    public void setAccountBySupplier(Account accountBySupplier) {
        this.accountBySupplier = accountBySupplier;
    }
    public Account getAccountByBank() {
        return this.accountByBank;
    }
    
    public void setAccountByBank(Account accountByBank) {
        this.accountByBank = accountByBank;
    }
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    public PaymentType getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public PurchusInvoice getPurchusInvoice() {
        return this.purchusInvoice;
    }
    
    public void setPurchusInvoice(PurchusInvoice purchusInvoice) {
        this.purchusInvoice = purchusInvoice;
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
    public String getCheNumber() {
        return this.cheNumber;
    }
    
    public void setCheNumber(String cheNumber) {
        this.cheNumber = cheNumber;
    }
    public String getCheRegDate() {
        return this.cheRegDate;
    }
    
    public void setCheRegDate(String cheRegDate) {
        this.cheRegDate = cheRegDate;
    }
    public String getCheDate() {
        return this.cheDate;
    }
    
    public void setCheDate(String cheDate) {
        this.cheDate = cheDate;
    }
    public Double getCheAmount() {
        return this.cheAmount;
    }
    
    public void setCheAmount(Double cheAmount) {
        this.cheAmount = cheAmount;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getCheStatus() {
        return this.cheStatus;
    }
    
    public void setCheStatus(Integer cheStatus) {
        this.cheStatus = cheStatus;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getChequeBranch() {
        return this.chequeBranch;
    }
    
    public void setChequeBranch(String chequeBranch) {
        this.chequeBranch = chequeBranch;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }




}


