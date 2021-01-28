package POJOS;
// Generated Jan 28, 2021 9:31:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * HoldInvoiceItem generated by hbm2java
 */
public class HoldInvoiceItem  implements java.io.Serializable {


     private Integer idholdInvoiceItem;
     private HoldInvoice holdInvoice;
     private Items items;
     private Stock stock;
     private Double qtt;
     private Double unitPrice;
     private Double descountRate;
     private Double descount;
     private Double total;
     private Double netTotal;
     private Integer status;
     private Double cost;
     private String nowType;
     private String originalType;
     private Double originalCostPerItem;
     private Double originalQtt;
     private String location;
     private Double profit;
     private Double qtySended;
     private Set holdReturnItemses = new HashSet(0);
     private Set doHoldItems = new HashSet(0);

    public HoldInvoiceItem() {
    }

	
    public HoldInvoiceItem(HoldInvoice holdInvoice, Items items, Stock stock) {
        this.holdInvoice = holdInvoice;
        this.items = items;
        this.stock = stock;
    }
    public HoldInvoiceItem(HoldInvoice holdInvoice, Items items, Stock stock, Double qtt, Double unitPrice, Double descountRate, Double descount, Double total, Double netTotal, Integer status, Double cost, String nowType, String originalType, Double originalCostPerItem, Double originalQtt, String location, Double profit, Double qtySended, Set holdReturnItemses, Set doHoldItems) {
       this.holdInvoice = holdInvoice;
       this.items = items;
       this.stock = stock;
       this.qtt = qtt;
       this.unitPrice = unitPrice;
       this.descountRate = descountRate;
       this.descount = descount;
       this.total = total;
       this.netTotal = netTotal;
       this.status = status;
       this.cost = cost;
       this.nowType = nowType;
       this.originalType = originalType;
       this.originalCostPerItem = originalCostPerItem;
       this.originalQtt = originalQtt;
       this.location = location;
       this.profit = profit;
       this.qtySended = qtySended;
       this.holdReturnItemses = holdReturnItemses;
       this.doHoldItems = doHoldItems;
    }
   
    public Integer getIdholdInvoiceItem() {
        return this.idholdInvoiceItem;
    }
    
    public void setIdholdInvoiceItem(Integer idholdInvoiceItem) {
        this.idholdInvoiceItem = idholdInvoiceItem;
    }
    public HoldInvoice getHoldInvoice() {
        return this.holdInvoice;
    }
    
    public void setHoldInvoice(HoldInvoice holdInvoice) {
        this.holdInvoice = holdInvoice;
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
    public Double getQtt() {
        return this.qtt;
    }
    
    public void setQtt(Double qtt) {
        this.qtt = qtt;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDescountRate() {
        return this.descountRate;
    }
    
    public void setDescountRate(Double descountRate) {
        this.descountRate = descountRate;
    }
    public Double getDescount() {
        return this.descount;
    }
    
    public void setDescount(Double descount) {
        this.descount = descount;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getNetTotal() {
        return this.netTotal;
    }
    
    public void setNetTotal(Double netTotal) {
        this.netTotal = netTotal;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public String getNowType() {
        return this.nowType;
    }
    
    public void setNowType(String nowType) {
        this.nowType = nowType;
    }
    public String getOriginalType() {
        return this.originalType;
    }
    
    public void setOriginalType(String originalType) {
        this.originalType = originalType;
    }
    public Double getOriginalCostPerItem() {
        return this.originalCostPerItem;
    }
    
    public void setOriginalCostPerItem(Double originalCostPerItem) {
        this.originalCostPerItem = originalCostPerItem;
    }
    public Double getOriginalQtt() {
        return this.originalQtt;
    }
    
    public void setOriginalQtt(Double originalQtt) {
        this.originalQtt = originalQtt;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Double getProfit() {
        return this.profit;
    }
    
    public void setProfit(Double profit) {
        this.profit = profit;
    }
    public Double getQtySended() {
        return this.qtySended;
    }
    
    public void setQtySended(Double qtySended) {
        this.qtySended = qtySended;
    }
    public Set getHoldReturnItemses() {
        return this.holdReturnItemses;
    }
    
    public void setHoldReturnItemses(Set holdReturnItemses) {
        this.holdReturnItemses = holdReturnItemses;
    }
    public Set getDoHoldItems() {
        return this.doHoldItems;
    }
    
    public void setDoHoldItems(Set doHoldItems) {
        this.doHoldItems = doHoldItems;
    }




}


