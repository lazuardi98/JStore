package jstore;
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
    private String city
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
        return this.province;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getDescription(){
        return this.description;
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
    
    public String toString(){
        return "########## LOCATION ##########" + "\n" +
                "City: " + this.city + "\n" +
                "Province: " + this.province + "\n" +
                "Description: " + this.description + "\n";
    }
}
