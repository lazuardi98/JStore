import java.util.*;
import java.time.LocalDate;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    //private static LocalDate localdate = LocalDate.now();
    //private static String date = localdate.toString();

    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemPaid(Item item, Customer customer)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod)
    {
        Invoice invoice = new Buy_Paid(new ArrayList<Integer>(Arrays.asList(item.getId())));
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static boolean finishTransaction(Invoice invoice){
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        invoice.setIsActive(false);
        System.out.println("isActive : " + invoice.getIsActive());
        return true;
    }
    
    public static boolean cancelTransaction(Invoice invoice){
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        DatabaseInvoice.removeInvoice(invoice.getId());
        return true;
    }
}
