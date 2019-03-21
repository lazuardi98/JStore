
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

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod = installmentPeriod;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod(){
        return installmentPeriod;
    }
    
    public int getInstallmentPrice(){
        return installmentPrice;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(int totalPrice){
        double kali = 1.02;
        installmentPrice = (int)(totalPrice/this.installmentPeriod*kali);
    }
    
    public void setTotalPrice(int installmentPeriod){
        this.totalPrice =  installmentPrice*installmentPeriod;
    }
    
    public void printData(){
        System.out.println("########## INVOICE ##########");
        System.out.println("ID: " + getId());
        System.out.println("Date: " + getDate());
        System.out.println("Total Item: " + getTotalItem());
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Installment Price: " + getInstallmentPrice());
        System.out.println("Status: " + INVOICE_STATUS);
    }
}
