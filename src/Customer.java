import java.util.regex.*;
import java.util.*;
import java.text.*;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
       this.id = DatabaseCustomer.getLastCustomerID()+1;
       this.name = name;
       this.username = username;
       setEmail(email);
       setPassword(password);
       this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
       this.id = DatabaseCustomer.getLastCustomerID()+1;
       this.name = name;
       this.username = username;
       setEmail(email);
       setPassword(password);
       birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Calendar getBirthDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("Birth date: " + sdf.format(this.birthDate.getTime()));
        return this.birthDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&’'*+/=?`{(|)}~^-]+(?:\\." +
                       "[a-zA-Z0-9_!#$%&’'*+/=?`{(|)}~^-]+)*@" +
                       "[a-zA-Z0-9]([a-zA-Z0-9-]+)(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (m.matches()){
            this.email = email;
        }
        else {
            this.email = null;
        }
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()){
            this.password = password;
        }
        else {
            this.password = null;
        }
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBirthDate(Calendar birthDate){
        this.birthDate = birthDate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth){
        birthDate.set(Calendar.YEAR, year);
        birthDate.set(Calendar.MONTH, month);
        birthDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    }
    
    public String toString(){
        System.out.println("########## CUSTOMER ##########");
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        getBirthDate();
        System.out.println();
        return "";
    }
}
