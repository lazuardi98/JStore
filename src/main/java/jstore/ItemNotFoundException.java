package jstore;

public class ItemNotFoundException extends Exception
{
    private int item_error;

    public ItemNotFoundException(int item_input)
    {
        super("Item ID: ");
        item_error = item_input;
    }

    public String getExMessage(){
        return "===== Item Not Found =====\n" +
                super.getMessage() + item_error + " not found." + "\n";
    }
}
