
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
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalItem, int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalItem = totalItem;
        this.totalPrice = totalPrice;
    }

    public int getId(){
        return this.id;
    }
    
    public Item getItem(){
        return this.item;
    }
    
    public String getDate(){
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
    
    public abstract void printData();
}
