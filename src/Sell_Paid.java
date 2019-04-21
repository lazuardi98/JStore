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
        super.setIsActive(false);
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
        String text;
        String item = "";
        String supplier_id = "";
        String supplier_name = "";
        for (int i = 0; i < getItem().size(); i++){
            item += DatabaseItem.getItemFromID(getItem().get(i)).getName() + ", ";
        }
        for (int i = 0; i < getItem().size(); i++){
            supplier_id += Integer.toString(DatabaseItem.getItemFromID(getItem().get(i)).getSupplier().getId()) + ", ";
        }
        for (int i = 0; i < getItem().size(); i++){
            supplier_name += DatabaseItem.getItemFromID(getItem().get(i)).getSupplier().getName() + ", ";
        }
        item = item.substring(0, item.length() - 2);
        supplier_id = supplier_id.substring(0, supplier_id.length() - 2);
        supplier_name = supplier_name.substring(0, supplier_name.length() - 2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        text = "########## INVOICE ##########" + "\n" +
                "ID: " + Integer.toString(getId()) + "\n" +
                "Item: " + item + "\n" +
                "Buy Date: " + sdf.format(getDate().getTime()) + "\n" +
                "Price Total: " + Integer.toString(getTotalPrice()) + "\n" +
                "Supplier ID: " + supplier_id + "\n" +
                "Supplier Name: " + supplier_name + "\n" +
                "Customer ID: " + Integer.toString(getCustomer().getId()) + "\n" +
                "Customer Name: " + getCustomer().getName() + "\n" +
                "Status: " + INVOICE_STATUS.toString() + "\n" +
                "Sell success." + "\n";
        return text;
    }
}
