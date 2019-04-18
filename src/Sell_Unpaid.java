import java.util.*;
import java.text.*;
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
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        setCustomer(customer);
        isActive = false;
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
    
    public String toString(){
        for (int i = 0; i < getItem().size(); i++){
            System.out.println("########## INVOICE ##########");
            System.out.println("ID: " + Integer.toString(getId()));
            //System.out.println("Item: " + getItem(i).getName());
            //System.out.println("Amount: " + Integer.toString(getTotalItem()));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
            //System.out.println("Price: " + Integer.toString(getItem().getPrice()));
            System.out.println("Price Total: " + Integer.toString(getTotalPrice()));
            //System.out.println("Supplier ID: " + Integer.toString(getItem().getSupplier().getId()));
            //System.out.println("Supplier Name: " + getItem().getSupplier().getName());
            System.out.println("Status: " + INVOICE_STATUS.toString());
            System.out.println("Buy success");
        }
        return "";
    }
}
