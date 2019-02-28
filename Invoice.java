
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int idItem;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
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
    
    public void setIdItem(int idItem){
        this.idItem = idItem;
    }
    
    public void printData(){
    }
}
