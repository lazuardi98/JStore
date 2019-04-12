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
        /* Location location = new Location("Depok", "West Java", "Student place");
        Supplier supplier = new Supplier(1, "ASUS", "asus@asus.com", "1-888-678-3688", location);
        location.printData();
        supplier.printData();
        Item item = new Item(1, "Laptop", 5, ItemStatus.New, 5000000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.orderSecondItem(item);
        Transaction.orderRefurbishedItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item); */
        //Buy_Paid test = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(20, 3)));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> item;
        list.add(10);
        list.add(20);
        list.add(30);
        item = list;
        for (int value : list) {
            System.out.println(value);
        }
        for (int value : item) {
            System.out.println(value);
        }
    }
}
