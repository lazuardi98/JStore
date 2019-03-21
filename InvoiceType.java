
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    
    private String name;
    
    InvoiceType(String value){
        name = value;
    }
    
    public String toString() {
        return name;
    }
}
