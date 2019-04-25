package jstore;

public class CustomerDoesntHaveActiveException extends Exception
{
    private Customer customer_error;

    public CustomerDoesntHaveActiveException(Customer customer_input)
    {
        super("dddddd");
        customer_error = customer_input;
    }

    public String getExMessage(){
        return "======= Dont Have Active =======\n" +
                super.getMessage() + customer_error + "## Doesnt have active invoice" + "\n";
    }
}
