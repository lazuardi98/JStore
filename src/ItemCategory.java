
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), Stationery("Stationery");
    
    private String name;
    
    ItemCategory(String value){
        name = value;
    }
    
    public String toString() {
        return name;
    }
}
