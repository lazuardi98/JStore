
/**
 * The Supplier program implements
 * state, behavior, and identity
 * of supplier.
 * 
 * @author Lazuardi Naufal / 1606880573
 * @version 2.0
 * @since 28-02-2019
 */
public class Supplier
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        this.id = DatabaseSupplier.getLastSupplierID()+1;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public Location getLocation(){
        return this.location;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    public String toString(){
        return "########## SUPPLIER ##########" + "\n" +
                "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Phone Number: " + this.phoneNumber + "\n" +
                "Location: " + this.location.getCity() + "\n";
    }
}
