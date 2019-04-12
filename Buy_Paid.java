import java.util.*;
import java.text.*;
import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
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
    
    public String toString(){
        System.out.println("########## INVOICE ##########");
        System.out.println("ID: " + Integer.toString(getId()));
        System.out.println("Item: " + getItem().getName());
        //System.out.println("Amount: " + Integer.toString(getTotalItem()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("Buy Date: " + sdf.format(getDate().getTime()).toString());
        System.out.println("Price: " + Integer.toString(getItem().getPrice()));
        System.out.println("Price Total: " + Integer.toString(getTotalPrice()));
        System.out.println("Supplier ID: " + Integer.toString(getItem().getSupplier().getId()));
        System.out.println("Supplier Name: " + getItem().getSupplier().getName());
        System.out.println("Status: " + INVOICE_STATUS.toString());
        System.out.println("Buy success");
        return "";
    }
}
