import java.util.*;
import java.text.*;
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
    private ArrayList<Integer> item; // new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    //private Item item;
    //private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        //this.id = id;
        this.item = item;
        this.id = DatabaseInvoice.getLastInvoiceID()+1;
        //this.totalItem = totalItem;
        //this.totalPrice = item.getPrice()*this.totalItem;
        this.date = Calendar.getInstance();
    }

    public int getId(){
        return this.id;
    }
    
    public Item getItem(){
        return null;
    }
    
    public Calendar getDate(){
        return this.date;
    }
    
    public int getTotalPrice(){
        return this.totalPrice;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    public boolean getIsActive(){
        return this.isActive;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setItem(ArrayList<Integer> item){
        this.item = item;
    }

    public void setDate(Calendar date){
        this.date = date;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
        //this.status = status;
    }
    
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    
    public abstract String toString();
}
