package POJOS;
// Generated Jan 28, 2021 9:31:10 PM by Hibernate Tools 4.3.1



/**
 * HoldReturnItems generated by hbm2java
 */
public class HoldReturnItems  implements java.io.Serializable {


     private Integer idholdReturnItems;
     private HoldInvoiceItem holdInvoiceItem;
     private HoldReturn holdReturn;
     private Items items;
     private Double qty;
     private Double total;
     private String type;
     private Double price;

    public HoldReturnItems() {
    }

	
    public HoldReturnItems(HoldInvoiceItem holdInvoiceItem, HoldReturn holdReturn, Items items) {
        this.holdInvoiceItem = holdInvoiceItem;
        this.holdReturn = holdReturn;
        this.items = items;
    }
    public HoldReturnItems(HoldInvoiceItem holdInvoiceItem, HoldReturn holdReturn, Items items, Double qty, Double total, String type, Double price) {
       this.holdInvoiceItem = holdInvoiceItem;
       this.holdReturn = holdReturn;
       this.items = items;
       this.qty = qty;
       this.total = total;
       this.type = type;
       this.price = price;
    }
   
    public Integer getIdholdReturnItems() {
        return this.idholdReturnItems;
    }
    
    public void setIdholdReturnItems(Integer idholdReturnItems) {
        this.idholdReturnItems = idholdReturnItems;
    }
    public HoldInvoiceItem getHoldInvoiceItem() {
        return this.holdInvoiceItem;
    }
    
    public void setHoldInvoiceItem(HoldInvoiceItem holdInvoiceItem) {
        this.holdInvoiceItem = holdInvoiceItem;
    }
    public HoldReturn getHoldReturn() {
        return this.holdReturn;
    }
    
    public void setHoldReturn(HoldReturn holdReturn) {
        this.holdReturn = holdReturn;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public Double getQty() {
        return this.qty;
    }
    
    public void setQty(Double qty) {
        this.qty = qty;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }




}


