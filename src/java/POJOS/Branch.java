package POJOS;
// Generated Jan 19, 2021 12:56:26 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Branch generated by hbm2java
 */
public class Branch  implements java.io.Serializable {


     private Integer idbranch;
     private String name;
     private Integer status;
     private String email;
     private String contact;
     private String fax;
     private String image;
     private String address;
     private String quotation;
     private String invoice;
     private String holdinvoice;
     private String po;
     private String receiveCash;
     private String releaseCash;
     private String doHeader;
     private String goodrnHeader;
     private String invoiceHeader;
     private String footer;
     private String creditInvoice;
     private String receiveChe;
     private String receiveBank;
     private String releaseChe;
     private String releaseBank;
     private String expensesHeader;
     private Set stocks = new HashSet(0);
     private Set dayStarts = new HashSet(0);
     private Set stockHistories = new HashSet(0);
     private Set stockReturns = new HashSet(0);
     private Set quotationInvoices = new HashSet(0);
     private Set holdRecipts = new HashSet(0);
     private Set purchusInvoiceRecipts = new HashSet(0);
     private Set employeeAccounts = new HashSet(0);
     private Set expencessAccounts = new HashSet(0);
     private Set invoiceRecipts = new HashSet(0);
     private Set returnItems = new HashSet(0);
     private Set stockDamages = new HashSet(0);
     private Set purchaseInvoiceOrders = new HashSet(0);
     private Set saleInvoices = new HashSet(0);
     private Set users = new HashSet(0);
     private Set stockTransfersForFromBranch = new HashSet(0);
     private Set stockTransfersForToBranch = new HashSet(0);
     private Set purchusInvoices = new HashSet(0);
     private Set holdInvoices = new HashSet(0);
     private Set otherTranses = new HashSet(0);
     private Set customerBranches = new HashSet(0);

    public Branch() {
    }

    public Branch(String name, Integer status, String email, String contact, String fax, String image, String address, String quotation, String invoice, String holdinvoice, String po, String receiveCash, String releaseCash, String doHeader, String goodrnHeader, String invoiceHeader, String footer, String creditInvoice, String receiveChe, String receiveBank, String releaseChe, String releaseBank, String expensesHeader, Set stocks, Set dayStarts, Set stockHistories, Set stockReturns, Set quotationInvoices, Set holdRecipts, Set purchusInvoiceRecipts, Set employeeAccounts, Set expencessAccounts, Set invoiceRecipts, Set returnItems, Set stockDamages, Set purchaseInvoiceOrders, Set saleInvoices, Set users, Set stockTransfersForFromBranch, Set stockTransfersForToBranch, Set purchusInvoices, Set holdInvoices, Set otherTranses, Set customerBranches) {
       this.name = name;
       this.status = status;
       this.email = email;
       this.contact = contact;
       this.fax = fax;
       this.image = image;
       this.address = address;
       this.quotation = quotation;
       this.invoice = invoice;
       this.holdinvoice = holdinvoice;
       this.po = po;
       this.receiveCash = receiveCash;
       this.releaseCash = releaseCash;
       this.doHeader = doHeader;
       this.goodrnHeader = goodrnHeader;
       this.invoiceHeader = invoiceHeader;
       this.footer = footer;
       this.creditInvoice = creditInvoice;
       this.receiveChe = receiveChe;
       this.receiveBank = receiveBank;
       this.releaseChe = releaseChe;
       this.releaseBank = releaseBank;
       this.expensesHeader = expensesHeader;
       this.stocks = stocks;
       this.dayStarts = dayStarts;
       this.stockHistories = stockHistories;
       this.stockReturns = stockReturns;
       this.quotationInvoices = quotationInvoices;
       this.holdRecipts = holdRecipts;
       this.purchusInvoiceRecipts = purchusInvoiceRecipts;
       this.employeeAccounts = employeeAccounts;
       this.expencessAccounts = expencessAccounts;
       this.invoiceRecipts = invoiceRecipts;
       this.returnItems = returnItems;
       this.stockDamages = stockDamages;
       this.purchaseInvoiceOrders = purchaseInvoiceOrders;
       this.saleInvoices = saleInvoices;
       this.users = users;
       this.stockTransfersForFromBranch = stockTransfersForFromBranch;
       this.stockTransfersForToBranch = stockTransfersForToBranch;
       this.purchusInvoices = purchusInvoices;
       this.holdInvoices = holdInvoices;
       this.otherTranses = otherTranses;
       this.customerBranches = customerBranches;
    }
   
    public Integer getIdbranch() {
        return this.idbranch;
    }
    
    public void setIdbranch(Integer idbranch) {
        this.idbranch = idbranch;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getQuotation() {
        return this.quotation;
    }
    
    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }
    public String getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
    public String getHoldinvoice() {
        return this.holdinvoice;
    }
    
    public void setHoldinvoice(String holdinvoice) {
        this.holdinvoice = holdinvoice;
    }
    public String getPo() {
        return this.po;
    }
    
    public void setPo(String po) {
        this.po = po;
    }
    public String getReceiveCash() {
        return this.receiveCash;
    }
    
    public void setReceiveCash(String receiveCash) {
        this.receiveCash = receiveCash;
    }
    public String getReleaseCash() {
        return this.releaseCash;
    }
    
    public void setReleaseCash(String releaseCash) {
        this.releaseCash = releaseCash;
    }
    public String getDoHeader() {
        return this.doHeader;
    }
    
    public void setDoHeader(String doHeader) {
        this.doHeader = doHeader;
    }
    public String getGoodrnHeader() {
        return this.goodrnHeader;
    }
    
    public void setGoodrnHeader(String goodrnHeader) {
        this.goodrnHeader = goodrnHeader;
    }
    public String getInvoiceHeader() {
        return this.invoiceHeader;
    }
    
    public void setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }
    public String getFooter() {
        return this.footer;
    }
    
    public void setFooter(String footer) {
        this.footer = footer;
    }
    public String getCreditInvoice() {
        return this.creditInvoice;
    }
    
    public void setCreditInvoice(String creditInvoice) {
        this.creditInvoice = creditInvoice;
    }
    public String getReceiveChe() {
        return this.receiveChe;
    }
    
    public void setReceiveChe(String receiveChe) {
        this.receiveChe = receiveChe;
    }
    public String getReceiveBank() {
        return this.receiveBank;
    }
    
    public void setReceiveBank(String receiveBank) {
        this.receiveBank = receiveBank;
    }
    public String getReleaseChe() {
        return this.releaseChe;
    }
    
    public void setReleaseChe(String releaseChe) {
        this.releaseChe = releaseChe;
    }
    public String getReleaseBank() {
        return this.releaseBank;
    }
    
    public void setReleaseBank(String releaseBank) {
        this.releaseBank = releaseBank;
    }
    public String getExpensesHeader() {
        return this.expensesHeader;
    }
    
    public void setExpensesHeader(String expensesHeader) {
        this.expensesHeader = expensesHeader;
    }
    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }
    public Set getDayStarts() {
        return this.dayStarts;
    }
    
    public void setDayStarts(Set dayStarts) {
        this.dayStarts = dayStarts;
    }
    public Set getStockHistories() {
        return this.stockHistories;
    }
    
    public void setStockHistories(Set stockHistories) {
        this.stockHistories = stockHistories;
    }
    public Set getStockReturns() {
        return this.stockReturns;
    }
    
    public void setStockReturns(Set stockReturns) {
        this.stockReturns = stockReturns;
    }
    public Set getQuotationInvoices() {
        return this.quotationInvoices;
    }
    
    public void setQuotationInvoices(Set quotationInvoices) {
        this.quotationInvoices = quotationInvoices;
    }
    public Set getHoldRecipts() {
        return this.holdRecipts;
    }
    
    public void setHoldRecipts(Set holdRecipts) {
        this.holdRecipts = holdRecipts;
    }
    public Set getPurchusInvoiceRecipts() {
        return this.purchusInvoiceRecipts;
    }
    
    public void setPurchusInvoiceRecipts(Set purchusInvoiceRecipts) {
        this.purchusInvoiceRecipts = purchusInvoiceRecipts;
    }
    public Set getEmployeeAccounts() {
        return this.employeeAccounts;
    }
    
    public void setEmployeeAccounts(Set employeeAccounts) {
        this.employeeAccounts = employeeAccounts;
    }
    public Set getExpencessAccounts() {
        return this.expencessAccounts;
    }
    
    public void setExpencessAccounts(Set expencessAccounts) {
        this.expencessAccounts = expencessAccounts;
    }
    public Set getInvoiceRecipts() {
        return this.invoiceRecipts;
    }
    
    public void setInvoiceRecipts(Set invoiceRecipts) {
        this.invoiceRecipts = invoiceRecipts;
    }
    public Set getReturnItems() {
        return this.returnItems;
    }
    
    public void setReturnItems(Set returnItems) {
        this.returnItems = returnItems;
    }
    public Set getStockDamages() {
        return this.stockDamages;
    }
    
    public void setStockDamages(Set stockDamages) {
        this.stockDamages = stockDamages;
    }
    public Set getPurchaseInvoiceOrders() {
        return this.purchaseInvoiceOrders;
    }
    
    public void setPurchaseInvoiceOrders(Set purchaseInvoiceOrders) {
        this.purchaseInvoiceOrders = purchaseInvoiceOrders;
    }
    public Set getSaleInvoices() {
        return this.saleInvoices;
    }
    
    public void setSaleInvoices(Set saleInvoices) {
        this.saleInvoices = saleInvoices;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getStockTransfersForFromBranch() {
        return this.stockTransfersForFromBranch;
    }
    
    public void setStockTransfersForFromBranch(Set stockTransfersForFromBranch) {
        this.stockTransfersForFromBranch = stockTransfersForFromBranch;
    }
    public Set getStockTransfersForToBranch() {
        return this.stockTransfersForToBranch;
    }
    
    public void setStockTransfersForToBranch(Set stockTransfersForToBranch) {
        this.stockTransfersForToBranch = stockTransfersForToBranch;
    }
    public Set getPurchusInvoices() {
        return this.purchusInvoices;
    }
    
    public void setPurchusInvoices(Set purchusInvoices) {
        this.purchusInvoices = purchusInvoices;
    }
    public Set getHoldInvoices() {
        return this.holdInvoices;
    }
    
    public void setHoldInvoices(Set holdInvoices) {
        this.holdInvoices = holdInvoices;
    }
    public Set getOtherTranses() {
        return this.otherTranses;
    }
    
    public void setOtherTranses(Set otherTranses) {
        this.otherTranses = otherTranses;
    }
    public Set getCustomerBranches() {
        return this.customerBranches;
    }
    
    public void setCustomerBranches(Set customerBranches) {
        this.customerBranches = customerBranches;
    }




}


