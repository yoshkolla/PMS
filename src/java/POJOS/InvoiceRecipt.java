package POJOS;
// Generated Jan 30, 2021 12:28:20 PM by Hibernate Tools 4.3.1



/**
 * InvoiceRecipt generated by hbm2java
 */
public class InvoiceRecipt  implements java.io.Serializable {


     private Integer idinvoiceRecipt;
     private Account accountByBankAccount;
     private Account accountByCustomer;
     private Branch branch;
     private PaymentType paymentType;
     private SaleInvoice saleInvoice;
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
     private String bank;
     private String time;

    public InvoiceRecipt() {
    }

	
    public InvoiceRecipt(Account accountByCustomer, Branch branch, PaymentType paymentType, User user) {
        this.accountByCustomer = accountByCustomer;
        this.branch = branch;
        this.paymentType = paymentType;
        this.user = user;
    }
    public InvoiceRecipt(Account accountByBankAccount, Account accountByCustomer, Branch branch, PaymentType paymentType, SaleInvoice saleInvoice, User user, Double amount, String cheNumber, String cheRegDate, String cheDate, Double cheAmount, Integer status, Integer cheStatus, String date, String chequeBranch, String remarks, String bank, String time) {
       this.accountByBankAccount = accountByBankAccount;
       this.accountByCustomer = accountByCustomer;
       this.branch = branch;
       this.paymentType = paymentType;
       this.saleInvoice = saleInvoice;
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
       this.bank = bank;
       this.time = time;
    }
   
    public Integer getIdinvoiceRecipt() {
        return this.idinvoiceRecipt;
    }
    
    public void setIdinvoiceRecipt(Integer idinvoiceRecipt) {
        this.idinvoiceRecipt = idinvoiceRecipt;
    }
    public Account getAccountByBankAccount() {
        return this.accountByBankAccount;
    }
    
    public void setAccountByBankAccount(Account accountByBankAccount) {
        this.accountByBankAccount = accountByBankAccount;
    }
    public Account getAccountByCustomer() {
        return this.accountByCustomer;
    }
    
    public void setAccountByCustomer(Account accountByCustomer) {
        this.accountByCustomer = accountByCustomer;
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
    public SaleInvoice getSaleInvoice() {
        return this.saleInvoice;
    }
    
    public void setSaleInvoice(SaleInvoice saleInvoice) {
        this.saleInvoice = saleInvoice;
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
    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }




}


