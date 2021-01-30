package POJOS;
// Generated Jan 30, 2021 12:28:20 PM by Hibernate Tools 4.3.1



/**
 * OtherTrans generated by hbm2java
 */
public class OtherTrans  implements java.io.Serializable {


     private Integer idotherTrans;
     private Account accountByBank;
     private Account accountBySupplier;
     private Branch branch;
     private PaymentType paymentType;
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
     private Integer credit;
     private Integer debit;
     private String time;

    public OtherTrans() {
    }

	
    public OtherTrans(Account accountBySupplier, Branch branch, PaymentType paymentType, User user) {
        this.accountBySupplier = accountBySupplier;
        this.branch = branch;
        this.paymentType = paymentType;
        this.user = user;
    }
    public OtherTrans(Account accountByBank, Account accountBySupplier, Branch branch, PaymentType paymentType, User user, Double amount, String cheNumber, String cheRegDate, String cheDate, Double cheAmount, Integer status, Integer cheStatus, String date, String chequeBranch, String remarks, Integer credit, Integer debit, String time) {
       this.accountByBank = accountByBank;
       this.accountBySupplier = accountBySupplier;
       this.branch = branch;
       this.paymentType = paymentType;
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
       this.credit = credit;
       this.debit = debit;
       this.time = time;
    }
   
    public Integer getIdotherTrans() {
        return this.idotherTrans;
    }
    
    public void setIdotherTrans(Integer idotherTrans) {
        this.idotherTrans = idotherTrans;
    }
    public Account getAccountByBank() {
        return this.accountByBank;
    }
    
    public void setAccountByBank(Account accountByBank) {
        this.accountByBank = accountByBank;
    }
    public Account getAccountBySupplier() {
        return this.accountBySupplier;
    }
    
    public void setAccountBySupplier(Account accountBySupplier) {
        this.accountBySupplier = accountBySupplier;
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
    public Integer getCredit() {
        return this.credit;
    }
    
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
    public Integer getDebit() {
        return this.debit;
    }
    
    public void setDebit(Integer debit) {
        this.debit = debit;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }




}


