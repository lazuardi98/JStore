
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
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int stock, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
       this.id = DatabaseItem.getLastItemID()+1;
       this.name = name;
       this.stock = stock;
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
    
    public int getStock(){
        return this.stock;
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

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setCategory(ItemCategory category){
        this.category = category;
    }
    
    public void setStatus(ItemStatus status){
        this.status = status;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }
    
    public String toString(){
        return name;
    }
    
    public void printData(){
        System.out.println("########## ITEM ##########");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Category: " + this.category );
        System.out.println("Status: " + this.status);
        System.out.println("Supplier: " + this.supplier.getName());
    }
}
