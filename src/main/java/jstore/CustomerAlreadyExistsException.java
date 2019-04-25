package jstore;

public class CustomerAlreadyExistsException extends Exception
{
    private Customer customer_error;

    public CustomerAlreadyExistsException(Customer customer_input)
    {
        super("Customer Email: ");
        customer_error = customer_input;
    }

    public String getExMessage(){
        return "=========================== Customer Already Exist ===========================\n" +
                super.getMessage() + customer_error.getEmail() + ", or Username: " + customer_error.getUsername()
                + " already exists." + "\n";
    }
}
