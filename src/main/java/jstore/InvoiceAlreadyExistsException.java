package jstore;

public class InvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    public InvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Invoice with Item list ");
        invoice_error = invoice_input;
    }

    public String getExMessage(){
        return "================== Invoice Already Exist ==================\n" +
                super.getMessage() + invoice_error.getItem() + " already ordered by "  +
                invoice_error.getCustomer().getUsername() + "\n";
    }
}
