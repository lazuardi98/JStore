
/**
 * The Location program implements
 * state, behavior, and identity
 * of location.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class Location
{
    // instance variables
    private String province;
    private String description;
    private String city;
    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getProvince(){
        return province;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getDescription(){
        return description;
    }

    public void setProvince(String province){
        this.province = province;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void printData(){
        System.out.println("########## LOCATION ##########");
        System.out.println("Province: " + this.province);
        System.out.println("City: " + this.city);
        System.out.println("Description: " + this.description);
    }
}
