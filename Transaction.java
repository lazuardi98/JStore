import java.time.LocalDate;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own

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
    public static void orderNewItem(Supplier supplier)
    {
        Item item = new Item(1, "Laptop", 5, ItemStatus.New, 5000000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item);
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 5000000, 2, InvoiceStatus.Paid);
        item.setStatus(ItemStatus.New);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
        invoice.printData();
    }
    
    public static void orderSecondItem(Supplier supplier)
    {
        Item item = new Item(1, "Laptop", 5, ItemStatus.New, 3000000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item);
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 3000000, 2, InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Second);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
        invoice.printData();
    }
    
    public static void orderRefurbishedItem(Supplier supplier)
    {
        Item item = new Item(1, "Laptop", 5, ItemStatus.New, 4000000, supplier, ItemCategory.Electronics);
        DatabaseItem.addItem(item);
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 4000000, 2, InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Refurbished);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
        invoice.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 5000000, 2, InvoiceStatus.Paid);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        invoice.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 5000000, 2, InvoiceStatus.Paid);
        invoice.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        invoice.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        LocalDate date = LocalDate.now();
        Invoice invoice = new Invoice(1, item, date.toString(), 5000000, 2, InvoiceStatus.Paid);
        invoice.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        invoice.printData();
    }
}
