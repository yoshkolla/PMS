package POJOS;
// Generated Jan 28, 2021 9:31:10 PM by Hibernate Tools 4.3.1



/**
 * StockTransfer generated by hbm2java
 */
public class StockTransfer  implements java.io.Serializable {


     private Integer idstockTransfer;
     private Branch branchByFromBranch;
     private Branch branchByToBranch;
     private Items items;
     private Stock stock;
     private User userByAcceptedUser;
     private User userByRequestUser;
     private String date;
     private String time;
     private Double requestQty;
     private Integer status;
     private Double sendQty;
     private String sendDate;
     private String sendTime;
     private Double transport;
     private String recieveDate;
     private String recieveTime;

    public StockTransfer() {
    }

	
    public StockTransfer(Branch branchByFromBranch, Branch branchByToBranch, Items items, User userByRequestUser) {
        this.branchByFromBranch = branchByFromBranch;
        this.branchByToBranch = branchByToBranch;
        this.items = items;
        this.userByRequestUser = userByRequestUser;
    }
    public StockTransfer(Branch branchByFromBranch, Branch branchByToBranch, Items items, Stock stock, User userByAcceptedUser, User userByRequestUser, String date, String time, Double requestQty, Integer status, Double sendQty, String sendDate, String sendTime, Double transport, String recieveDate, String recieveTime) {
       this.branchByFromBranch = branchByFromBranch;
       this.branchByToBranch = branchByToBranch;
       this.items = items;
       this.stock = stock;
       this.userByAcceptedUser = userByAcceptedUser;
       this.userByRequestUser = userByRequestUser;
       this.date = date;
       this.time = time;
       this.requestQty = requestQty;
       this.status = status;
       this.sendQty = sendQty;
       this.sendDate = sendDate;
       this.sendTime = sendTime;
       this.transport = transport;
       this.recieveDate = recieveDate;
       this.recieveTime = recieveTime;
    }
   
    public Integer getIdstockTransfer() {
        return this.idstockTransfer;
    }
    
    public void setIdstockTransfer(Integer idstockTransfer) {
        this.idstockTransfer = idstockTransfer;
    }
    public Branch getBranchByFromBranch() {
        return this.branchByFromBranch;
    }
    
    public void setBranchByFromBranch(Branch branchByFromBranch) {
        this.branchByFromBranch = branchByFromBranch;
    }
    public Branch getBranchByToBranch() {
        return this.branchByToBranch;
    }
    
    public void setBranchByToBranch(Branch branchByToBranch) {
        this.branchByToBranch = branchByToBranch;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public User getUserByAcceptedUser() {
        return this.userByAcceptedUser;
    }
    
    public void setUserByAcceptedUser(User userByAcceptedUser) {
        this.userByAcceptedUser = userByAcceptedUser;
    }
    public User getUserByRequestUser() {
        return this.userByRequestUser;
    }
    
    public void setUserByRequestUser(User userByRequestUser) {
        this.userByRequestUser = userByRequestUser;
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
    public Double getRequestQty() {
        return this.requestQty;
    }
    
    public void setRequestQty(Double requestQty) {
        this.requestQty = requestQty;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Double getSendQty() {
        return this.sendQty;
    }
    
    public void setSendQty(Double sendQty) {
        this.sendQty = sendQty;
    }
    public String getSendDate() {
        return this.sendDate;
    }
    
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
    public String getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
    public Double getTransport() {
        return this.transport;
    }
    
    public void setTransport(Double transport) {
        this.transport = transport;
    }
    public String getRecieveDate() {
        return this.recieveDate;
    }
    
    public void setRecieveDate(String recieveDate) {
        this.recieveDate = recieveDate;
    }
    public String getRecieveTime() {
        return this.recieveTime;
    }
    
    public void setRecieveTime(String recieveTime) {
        this.recieveTime = recieveTime;
    }




}


