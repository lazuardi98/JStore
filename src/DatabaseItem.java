import java.util.ArrayList;
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
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
    
    public static ArrayList<Item> getItemDatabase(){
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID(){
        return LAST_ITEM_ID;
    }
    
    public static boolean addItem(Item item){
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getName().equals(item.getName()) &&
                    ITEM_DATABASE.get(i).getStatus().equals(item.getStatus()) &&
                    ITEM_DATABASE.get(i).getCategory().equals(item.getCategory()) &&
                    ITEM_DATABASE.get(i).getSupplier().equals(item.getSupplier())){
                return false;
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID++;
        return true;
    }
      
    public static Item getItemFromID(int id){
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getId() == id){
                return ITEM_DATABASE.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier){
        ArrayList<Item> ItemBySupplier = new ArrayList<Item>();
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getSupplier().equals(supplier)){
                ItemBySupplier.add(ITEM_DATABASE.get(i));
            }
        }
        if (ItemBySupplier.isEmpty()){
            return null;
        }
        else {
            return ItemBySupplier;
        }
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category){
        ArrayList<Item> ItemByCategory = new ArrayList<Item>();
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getCategory().equals(category)){
                ItemByCategory.add(ITEM_DATABASE.get(i));
            }
        }
        if (ItemByCategory.isEmpty()){
            return null;
        }
        else {
            return ItemByCategory;
        }
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status){
        ArrayList<Item> ItemByStatus = new ArrayList<Item>();
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getStatus().equals(status)){
                ItemByStatus.add(ITEM_DATABASE.get(i));
            }
        }
        if (ItemByStatus.isEmpty()){
            return null;
        }
        else {
            return ItemByStatus;
        }
    }
    
    public static boolean removeItem(int id){
        for (int i = 0; i < ITEM_DATABASE.size(); i++){
            if (ITEM_DATABASE.get(i).getId() == id){
                ITEM_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
