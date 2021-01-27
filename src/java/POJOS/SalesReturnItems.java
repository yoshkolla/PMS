package POJOS;
// Generated Jan 27, 2021 1:27:27 PM by Hibernate Tools 4.3.1



/**
 * SalesReturnItems generated by hbm2java
 */
public class SalesReturnItems  implements java.io.Serializable {


     private Integer idsalesReturnItems;
     private Items items;
     private SaleInvoiceItem saleInvoiceItem;
     private SalesReturn salesReturn;
     private Double qty;
     private Double total;
     private String type;
     private Double price;

    public SalesReturnItems() {
    }

	
    public SalesReturnItems(Items items, SaleInvoiceItem saleInvoiceItem, SalesReturn salesReturn) {
        this.items = items;
        this.saleInvoiceItem = saleInvoiceItem;
        this.salesReturn = salesReturn;
    }
    public SalesReturnItems(Items items, SaleInvoiceItem saleInvoiceItem, SalesReturn salesReturn, Double qty, Double total, String type, Double price) {
       this.items = items;
       this.saleInvoiceItem = saleInvoiceItem;
       this.salesReturn = salesReturn;
       this.qty = qty;
       this.total = total;
       this.type = type;
       this.price = price;
    }
   
    public Integer getIdsalesReturnItems() {
        return this.idsalesReturnItems;
    }
    
    public void setIdsalesReturnItems(Integer idsalesReturnItems) {
        this.idsalesReturnItems = idsalesReturnItems;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public SaleInvoiceItem getSaleInvoiceItem() {
        return this.saleInvoiceItem;
    }
    
    public void setSaleInvoiceItem(SaleInvoiceItem saleInvoiceItem) {
        this.saleInvoiceItem = saleInvoiceItem;
    }
    public SalesReturn getSalesReturn() {
        return this.salesReturn;
    }
    
    public void setSalesReturn(SalesReturn salesReturn) {
        this.salesReturn = salesReturn;
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


