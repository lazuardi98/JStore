import java.util.*;
import java.text.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        setCustomer(customer);
        isActive = true;
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
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public String toString(){
        for (int i = 0; i < 1; i++){
            System.out.println("########## INVOICE ##########");
            System.out.println("ID: " + Integer.toString(getId()));
            System.out.println("Item: " + DatabaseItem.getItemFromID(getItem().get(i)).getName());
            //System.out.println("Amount: " + Integer.toString(getTotalItem()));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
            System.out.println("Buy date: " + sdf.format(getDate().getTime()));
            //System.out.println("Price: " + Integer.toString(getItem().getPrice()));
            System.out.println("Price Total: " + Integer.toString(getTotalPrice()));
            System.out.println("Supplier ID: " + Integer.toString(DatabaseItem.getItemFromID(getItem().get(i)).getSupplier().getId()));
            System.out.println("Supplier Name: " + DatabaseItem.getItemFromID(getItem().get(i)).getSupplier().getName());
            System.out.println("Status: " + INVOICE_STATUS.toString());
            System.out.println("Buy success");
        }
        return "";
    }
}
