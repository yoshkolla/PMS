package POJOS;
// Generated Jan 27, 2021 12:48:16 PM by Hibernate Tools 4.3.1



/**
 * CustomerTypeCustomer generated by hbm2java
 */
public class CustomerTypeCustomer  implements java.io.Serializable {


     private Integer idcustomerTypeCustomer;
     private Account account;
     private CustomerType customerType;
     private Integer status;

    public CustomerTypeCustomer() {
    }

	
    public CustomerTypeCustomer(Account account, CustomerType customerType) {
        this.account = account;
        this.customerType = customerType;
    }
    public CustomerTypeCustomer(Account account, CustomerType customerType, Integer status) {
       this.account = account;
       this.customerType = customerType;
       this.status = status;
    }
   
    public Integer getIdcustomerTypeCustomer() {
        return this.idcustomerTypeCustomer;
    }
    
    public void setIdcustomerTypeCustomer(Integer idcustomerTypeCustomer) {
        this.idcustomerTypeCustomer = idcustomerTypeCustomer;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public CustomerType getCustomerType() {
        return this.customerType;
    }
    
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }




}


