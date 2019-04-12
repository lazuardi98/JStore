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
    
    public boolean addCustomer(Customer customer){
        return true;
    }
    
    public static int getLastCustomerID(){
        return LAST_CUSTOMER_ID;
    }
    
    public boolean removeCustomer(Customer customer){
        return false;
    }
    
    public Customer getCustomer(){
        return null;
    }
    
    public Customer[] getListCustomer(){
        return null;
    }
}
