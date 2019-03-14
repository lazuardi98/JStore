
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
    public String city;
    
    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public String getCity(){
        return city;
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

    public void setCity(String city){
        this.city = city;
    }
    
    public void printData(){
        System.out.println("########## SUPPLIER ##########");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Location: " + this.location);
    }
}
