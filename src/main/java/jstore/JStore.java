package jstore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
/**
 * Description
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
@SpringBootApplication
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
        SpringApplication.run(JStore.class, args);
        Location location1 = new Location("Depok", "West Java", "Student place");
        
        Supplier supplier1 = new Supplier("ASUS", "asus@asus.com", "1-888-678-3688", location1);
        DatabaseSupplier.addSupplier(supplier1);
        Supplier supplier2 = new Supplier("Apple", "apple@apple.com", "1-123-456-7899", location1);
        DatabaseSupplier.addSupplier(supplier2);
        Supplier supplier3 = new Supplier("Sony", "sony@sony.com", "1-978-543-6666", location1);
        DatabaseSupplier.addSupplier(supplier3);
        //Supplier supplier4 = new Supplier("Sony", "sony@sony.com", "1-978-543-6666", location1);
        //DatabaseSupplier.addSupplier(supplier4);
        
        Item item1 = new Item("ASUS RoG", ItemStatus.New, 20000000, supplier1, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);
        Item item2 = new Item("Apple Mac", ItemStatus.Second, 15000000, supplier2, ItemCategory.Electronics);
        DatabaseItem.addItem(item2);
        Item item3 = new Item("Sony Xperia", ItemStatus.Refurbished, 5000000, supplier3, ItemCategory.Electronics);
        DatabaseItem.addItem(item3);
        Item item4 = new Item("Apple Iphone", ItemStatus.Second, 8000000, supplier2, ItemCategory.Electronics);
        DatabaseItem.addItem(item4);
        
        /* Customer customer1 = new Customer("Ardi", "ardi98@yahoo.com", "ardi98", "Xabcdef1", 1998, 1, 23);
        DatabaseCustomer.addCustomer(customer1);
        Customer customer2 = new Customer("Lara", "lara@google.com", "lara01", "Yabcdef2", 2001, 3, 3);
        DatabaseCustomer.addCustomer(customer2);
        Customer customer3 = new Customer("Anonymus", "anonymus@yahoo.com", "anonymus90", "Zabcdef3", 1998, 4, 4);
        DatabaseCustomer.addCustomer(customer3);
        Customer customer4 = new Customer("Anonymus", "anonymus@yahoo.com", "anonymus90", "Zabcdef3", 1998, 4, 4);
        DatabaseCustomer.addCustomer(customer4);

        Transaction.sellItemPaid(new ArrayList<Integer>(Arrays.asList(1, 2)), customer1);
        Transaction.sellItemUnpaid(new ArrayList<Integer>(Arrays.asList(1, 3)), customer2);
        Transaction.sellItemInstallment(new ArrayList<Integer>(Arrays.asList(2, 3)), customer3, 2);
        Transaction.orderNewItem(new ArrayList<Integer>(Arrays.asList(2)));
        Transaction.sellItemPaid(new ArrayList<Integer>(Arrays.asList(1, 2)), customer1);

        DatabaseSupplier.removeSupplier(7);
        DatabaseItem.removeItem(7);
        DatabaseCustomer.removeCustomer(7);
        DatabaseInvoice.removeInvoice(7);
        try {
            DatabaseInvoice.getActiveOrder(customer1);
        } catch (Exception exp){}

        System.out.println(location1.toString());

        for (int i = 0; i < DatabaseSupplier.getSupplierDatabase().size(); i++){
            System.out.println(DatabaseSupplier.getSupplierDatabase().get(i).toString());
        }

        for (int i = 0; i < DatabaseItem.getItemDatabase().size(); i++){
            System.out.println(DatabaseItem.getItemDatabase().get(i).toString());
        }

        for (int i = 0; i < DatabaseCustomer.getCustomerDatabase().size(); i++){
            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }

        for (int i = 0; i < DatabaseInvoice.getInvoiceDatabase().size(); i++){
            System.out.println(DatabaseInvoice.getInvoiceDatabase().get(i).toString());
        }

        System.out.println("isActive: " + DatabaseInvoice.getInvoice(2).getIsActive());
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1)); */

        /* System.out.println(location1.toString());
        System.out.println(supplier1.toString());
        System.out.println(item1.toString());
        System.out.println(customer1.toString());
        System.out.println(DatabaseInvoice.getInvoice(1).toString()); */
        //System.out.println();

        //System.out.println(DatabaseItem.getItemDatabase());
        //System.out.println(DatabaseItem.getItemDatabase().size());

        /* System.out.println(DatabaseInvoice.getInvoice(1).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(2).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(3).getCustomer().getName());
        System.out.println(DatabaseInvoice.getInvoice(1).getIsActive());
        System.out.println(DatabaseInvoice.getInvoice(2).getIsActive());
        System.out.println(DatabaseInvoice.getInvoice(3).getIsActive()); */

        /*
        for (int i = 0; i < what; i++)
        Transaction.orderNewItem(item);
        Transaction.orderSecondItem(item);
        Transaction.orderRefurbishedItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item); */
        //Transaction.sellItemPaid(new Item[]{item1}, customer1);
        //Transaction.sellItemUnpaid(new Item[]{item2}, customer2);
        //Transaction.sellItemInstallment(new Item[]{item3}, customer3, 2);
        //Invoice test = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(20, 3))); */
    }
}
