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
    private static LocalDate localdate = LocalDate.now();
    private static String date = localdate.toString();

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
        Invoice invoice = new Buy_Paid(1, item, date, 5, item.getPrice());
        if(invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, date, 5, item.getPrice());
        if(invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, date, 5, item.getPrice());
        if(invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice invoice = new Sell_Paid(1, item, date, 3, item.getPrice());
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice = new Sell_Unpaid(1, item, date, 3, item.getPrice(), "30-Mar-19");
        item.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        Invoice invoice = new Sell_Installment(1, item, date, 3, item.getPrice(), 2);
        item.printData();
    }
}
