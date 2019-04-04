import java.util.Date;
import java.util.Calendar;
/**
 * The Invoice program implements
 * state, behavior, and identity
 * of invoice.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public abstract class Invoice
{
    // instance variables
    private int id;
    private Item item;
    private Calendar date = Calendar.getInstance();
    private int totalPrice;
    private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, int totalItem)
    {
        this.id = id;
        this.item = item;
        this.totalItem = totalItem;
        this.totalPrice = item.getPrice()*this.totalItem;
    }

    public int getId(){
        return this.id;
    }
    
    public Item getItem(){
        return this.item;
    }
    
    public Calendar getDate(){
        return this.date;
    }
    
    public int getTotalPrice(){
        return this.totalPrice;
    }
    
    public int getTotalItem(){
        return this.totalItem;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();

    public void setId(int id){
        this.id = id;
    }
    
    public void setItem(Item item){
        this.item = item;
    }

    public void setDate(Calendar date){
        this.date = date;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setTotalItean(int totalItem){
        this.totalItem = totalItem;
    }
    
    /*public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }*/
    
    public abstract void printData();
    
    public String toString(){
        return item.toString();
    } 
}
