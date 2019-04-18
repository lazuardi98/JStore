
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
    
    private String name;
    
    InvoiceStatus(String value){
        name = value;
    }
    
    public String toString() {
        return name;
    }
}
