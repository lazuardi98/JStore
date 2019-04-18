import java.util.*;
import java.text.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, Customer customer, int installmentPeriod)
    {
        // initialise instance variables
        super(item);
        setCustomer(customer);
        this.installmentPeriod = installmentPeriod;
        setInstallmentPrice();
        isActive = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod(){
        return this.installmentPeriod;
    }
    
    public int getInstallmentPrice(){
        return installmentPrice;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(){
        //double kali = 1.02;
        installmentPrice = (int)((super.getTotalPrice()/this.installmentPeriod)*1.02);
    }
    
    public void setTotalPrice(){
        //super.setTotalPrice(installmentPrice*this.installmentPeriod);
        super.setTotalPrice();
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
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
