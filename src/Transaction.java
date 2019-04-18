import java.util.*;
import java.time.LocalDate;
import java.util.stream.*;
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

    public static void orderNewItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void orderSecondItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderRefurbishedItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer) {
        Invoice invoice1 = new Sell_Paid(item_list, customer);
        DatabaseInvoice.addInvoice(invoice1);
    }
    
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer)
    {
        Invoice invoice2 = new Sell_Unpaid(item_list, customer);
        DatabaseInvoice.addInvoice(invoice2);
    }
    
    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod)
    {
        Invoice invoice3 = new Sell_Installment(item_list, customer, installmentPeriod);
        DatabaseInvoice.addInvoice(invoice3);
    }
    
    public static boolean finishTransaction(Invoice invoice){
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoice == null)
        {
            return false;
        }
        if (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) ||
                invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)){
            invoice.setIsActive(false);
            System.out.println("isActive: " + invoice.getIsActive());
            return true;
        }
        return false;
    }
    
    public static boolean cancelTransaction(Invoice invoice){
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoice == null)
        {
            return false;
        }
        if (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) ||
                invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)){
            DatabaseInvoice.removeInvoice(invoice.getId());
            return true;
        }
        return false;
    }
}
