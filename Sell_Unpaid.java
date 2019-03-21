
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private String dueDate;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalItem, int totalPrice, String dueDate)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        dueDate = dueDate;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public void printData(){
        System.out.println("########## INVOICE ##########");
        System.out.println("ID: " + getId());
        System.out.println("Date: " + getDate());
        System.out.println("Due Date: " + getDueDate());
        System.out.println("Total Item: " + getTotalItem());
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("Status: " + INVOICE_STATUS);
    }
}
