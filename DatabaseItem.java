
/**
 * The DatabaseItem program implements an application
 * that configure the database for item.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class DatabaseItem
{
    // instance variables
    private Item[] listItem;
    public static Item itemDB;

    public static boolean addItem(Item item){
        if (itemDB != item){
            itemDB = item;
            return true;
        }
        else {
            DatabaseItem.removeItem(item);
            itemDB = item;
            return false;
        }
    }
    
    public static boolean removeItem(Item item){
        itemDB = null;
        return true;
    }
    
    public static Item getItem(){
        return itemDB;
    }
    
    public Item[] getItemDatabase(){
        return listItem;
    }
}
