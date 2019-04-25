package jstore;
/**
 * The Item program implements
 * state, behavior, and identity
 * of item.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class Item
{
    // instance variables
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
       this.id = DatabaseItem.getLastItemID()+1;
       this.name = name;
       this.price = price;
       this.supplier = supplier;
       this.category = category;
       this.status = status;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public ItemCategory getCategory(){
        return this.category;
    }
    
    public ItemStatus getStatus(){
        return this.status;
    }
    
    public Supplier getSupplier(){
        return this.supplier;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setCategory(ItemCategory category){
        this.category = category;
    }
    
    public void setStatus(ItemStatus status){
        this.status = status;
    }
    
    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }
    
    public String toString(){
        return "########## ITEM ##########" + "\n" +
                "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Price: " + this.price + "\n" +
                "Category: " + this.category + "\n" +
                "Status: " + this.status + "\n" +
                "Supplier: " + this.supplier.getName() + "\n";
    }
}
