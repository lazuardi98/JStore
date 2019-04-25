package jstore;

public class SupplierAlreadyExistsException extends Exception
{
    private Supplier supplier_error;

    public SupplierAlreadyExistsException(Supplier supplier_input)
    {
        super("Supplier Email: ");
        supplier_error = supplier_input;
    }

    public String getExMessage(){
        return "============================= Supplier Already Exist =============================\n" +
                super.getMessage() + supplier_error.getEmail() + ", or Phone Number: " +  supplier_error.getPhoneNumber() +
                " already exists." + "\n";
    }
}
