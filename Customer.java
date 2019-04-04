//import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       this.id = id;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-yyyy");
        String bdate = ("Birth date: " + date.format(this.birthDate));
        System.out.print(bdate);
        return this.birthDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
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
