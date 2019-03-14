
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
    private String[] listItem;
    public static Item itemDB;

    public static boolean addItem(Item item){
        return true;
    }
    
    public static boolean removeItem(Item item){
        return false;
    }
    
    public static Item getItem(){
        return itemDB;
    }
    
    public String[] getItemDatabase(){
        return listItem;
    }
}
