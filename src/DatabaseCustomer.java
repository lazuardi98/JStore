import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    
    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }
    
    public static boolean addCustomer(Customer customer){
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++){
            if (CUSTOMER_DATABASE.get(i).getUsername().equals(customer.getUsername()) ||
                CUSTOMER_DATABASE.get(i).getEmail().equals(customer.getEmail())){
                    return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID++;
        return true;
    }
    
    public static Customer getCustomer(int id){
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++){
            if (CUSTOMER_DATABASE.get(i).getId() == id){
                return CUSTOMER_DATABASE.get(i);
            }
        }
        return null;
    }
    
    public static boolean removeCustomer(int id){
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++){
            if (CUSTOMER_DATABASE.get(i).getId() == id){
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
