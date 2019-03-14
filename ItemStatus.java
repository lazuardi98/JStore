
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
    
    private String name;
    
    ItemStatus(String value){
        name = value;
    }
    
    public String toString() {
        return name;
    }
}
