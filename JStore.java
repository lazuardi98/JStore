
/**
 * Description
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class JStore
{
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
    }

    public static void main(String[] args)
    {
        Location Location = new Location("Depok", "West Java", "Student place");
        Supplier Supplier = new Supplier(1, "ASUS", "asus@asus.com", "1-888-678-3688", Location);
        Location.printData();
        Supplier.printData();
    }
}
