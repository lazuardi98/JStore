import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    public Customer(String name, String email, String username, String password, int id, Calendar birthDate)
    {
       this.id = DatabaseCustomer.getLastCustomerID()+1;
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
     Customer cust1 = new Customer(name, email, username, password, id, new GregorianCalendar (year, month, dayOfMonth));
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
        year = year;
        month = month;
        dayOfMonth = dayOfMonth;
    }
}
