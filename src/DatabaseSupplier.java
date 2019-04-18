import java.util.ArrayList;
/**
* The DatabaseSupplier program implements an application
* that configure the database for supplier.
* 
* @author Lazuardi Naufal / 1606880573
* @version 2.0
* @since 28-02-2019
*/
public class DatabaseSupplier
{
    // instance variables
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID(){
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier){
        for (int i = 0; i < SUPPLIER_DATABASE.size(); i++){
            if (SUPPLIER_DATABASE.get(i).getEmail().equals(supplier.getEmail()) ||
                SUPPLIER_DATABASE.get(i).getPhoneNumber().equals(supplier.getPhoneNumber())){
                    return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID++;
        return true;
    }
    
    public static Supplier getSupplier(int id){
        for (int i = 0; i < SUPPLIER_DATABASE.size(); i++){
            if (SUPPLIER_DATABASE.get(i).getId() == id){
                return SUPPLIER_DATABASE.get(i);
            }
        }
        return null;
    }
    
    public static boolean removeSupplier(int id){
        for (int i = 0; i < SUPPLIER_DATABASE.size(); i++){
            if (SUPPLIER_DATABASE.get(i).getId() == id){
                ArrayList<Item> ItemRemove = new ArrayList<Item>();
                ItemRemove.addAll(DatabaseItem.getItemFromSupplier(SUPPLIER_DATABASE.get(i)));
                for (int j = 0; j < ItemRemove.size(); j++){
                    DatabaseItem.removeItem(ItemRemove.get(j).getId());
                }
                SUPPLIER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
