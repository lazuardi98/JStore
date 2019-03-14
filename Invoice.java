
/**
 * The Invoice program implements
 * state, behavior, and identity
 * of invoice.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class Invoice
{
    // instance variables
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private int idItem;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice, int totalItem, InvoiceStatus status)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalItem = totalItem;
        this.status = status;
    }

    public int getId(){
        return id;
    }
    
    public Item getItem(){
        return item;
    }
    
    public String getDate(){
        return date;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }
    
    public int getTotalItem(){
        return totalItem;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return status;
    }
    
    public int getIdItem(){
        return idItem;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setItem(Item item){
        this.item = item;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setTotalItean(int totalItem){
        this.totalItem = totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }
    
    public void setIdItem(int idItem){
        this.idItem = idItem;
    }
    
    public void printData(){
        System.out.println("########## INVOICE ##########");
        System.out.println("ID: " + this.id);
        System.out.println("Date: " + this.item);
        System.out.println("Item: " + this.date);
        System.out.println("Total Item: " + this.totalItem);
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + this.status);
    }
}
