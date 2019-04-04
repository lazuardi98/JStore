import java.util.Date;
import java.util.Calendar;
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
    private Calendar dueDate = Calendar.getInstance();
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        setCustomer(customer);
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
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public Calendar getDueDate(){
        dueDate.add(Calendar.DATE, 1);
        return dueDate;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate){
        dueDate = dueDate;
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
