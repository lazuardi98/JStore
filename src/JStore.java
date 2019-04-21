import java.util.*;
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
        Location location1 = new Location("Depok", "West Java", "Student place");
        
        Supplier supplier1 = new Supplier("ASUS", "asus@asus.com", "1-888-678-3688", location1);
        DatabaseSupplier.addSupplier(supplier1);
        Supplier supplier2 = new Supplier("Apple", "apple@apple.com", "1-123-456-7899", location1);
        DatabaseSupplier.addSupplier(supplier2);
        Supplier supplier3 = new Supplier("Sony", "asus@asus.com", "1-978-543-6666", location1);
        DatabaseSupplier.addSupplier(supplier3);
        
        Item item1 = new Item("ASUS RoG", ItemStatus.New, 20000000, supplier1, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);
        Item item2 = new Item("Apple Mac", ItemStatus.Second, 15000000, supplier2, ItemCategory.Electronics);
        DatabaseItem.addItem(item2);
        Item item3 = new Item("Sony Xperia", ItemStatus.Refurbished, 5000000, supplier3, ItemCategory.Electronics);
        DatabaseItem.addItem(item3);
        
        Customer customer1 = new Customer("Ardi", "ardi98@yahoo.com", "ardi98", "Xabcdef1", 1998, 1, 23);
        DatabaseCustomer.addCustomer(customer1);
        Customer customer2 = new Customer("Lara", "lara@google.com", "lara01", "Yabcdef2", 2001, 3, 3);
        DatabaseCustomer.addCustomer(customer2);
        Customer customer3 = new Customer("Anonymus", "anonymus@yahoo.com", "anonymus90", "Zabcdef3", 1998, 4, 4);
        DatabaseCustomer.addCustomer(customer3);

        Transaction.sellItemPaid(new ArrayList<Integer>(Arrays.asList(1, 2)), customer1);
        Transaction.sellItemUnpaid(new ArrayList<Integer>(Arrays.asList(1, 3)), customer2);
        Transaction.sellItemInstallment(new ArrayList<Integer>(Arrays.asList(2, 3)), customer3, 2);
        Transaction.orderNewItem(new ArrayList<Integer>(Arrays.asList(2)));

        System.out.println(location1.toString());
        System.out.println(supplier1.toString());
        System.out.println(supplier2.toString());
        System.out.println(supplier3.toString());
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        System.out.println(DatabaseInvoice.getInvoice(1).toString());
        System.out.println(DatabaseInvoice.getInvoice(2).toString());
        System.out.println(DatabaseInvoice.getInvoice(3).toString());
        System.out.println(DatabaseInvoice.getInvoice(4).toString());
        //System.out.println();

        //System.out.println(DatabaseItem.getItemDatabase());
        //System.out.println(DatabaseItem.getItemDatabase().size());

        /* System.out.println(DatabaseInvoice.getInvoice(1).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(2).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(3).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(1).getIsActive());
        System.out.println(DatabaseInvoice.getInvoice(2).getIsActive());
        System.out.println(DatabaseInvoice.getInvoice(3).getIsActive()); */

        System.out.println("isActive: " + DatabaseInvoice.getInvoice(2).getIsActive());
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1));

        /* Transaction.orderNewItem(item);
        Transaction.orderSecondItem(item);
        Transaction.orderRefurbishedItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item); */
        //Transaction.sellItemPaid(new Item[]{item1}, customer1);
        //Transaction.sellItemUnpaid(new Item[]{item2}, customer2);
        //Transaction.sellItemInstallment(new Item[]{item3}, customer3, 2);
        //Invoice test = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(20, 3)));
    }
}
