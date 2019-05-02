package jstore;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++){
            if (INVOICE_DATABASE.get(i).getCustomer().equals(invoice.getCustomer()) &&
                    INVOICE_DATABASE.get(i).getItem().equals(invoice.getItem())){
                try {
                    throw new InvoiceAlreadyExistsException(invoice);
                } catch (InvoiceAlreadyExistsException e){
                    System.out.println(e.getExMessage());
                    return false;
                }
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID++;
        return true;
    }
    
    public static Invoice getInvoice(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++){
            if (INVOICE_DATABASE.get(i).getId() == id){
                return INVOICE_DATABASE.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList<Invoice> getActiveOrder(Customer customer){
        ArrayList<Invoice> listActiveOrder = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++){
            if (INVOICE_DATABASE.get(i).getInvoiceStatus().equals(InvoiceStatus.Unpaid) ||
                    INVOICE_DATABASE.get(i).getInvoiceStatus().equals(InvoiceStatus.Installment)){
                if (INVOICE_DATABASE.get(i).getCustomer().equals(customer) &&
                        INVOICE_DATABASE.get(i).getIsActive() == true){
                    listActiveOrder.add(INVOICE_DATABASE.get(i));
                }
            }
        }
        if (listActiveOrder.isEmpty()){
            try {
                throw new CustomerDoesntHaveActiveException(customer);
            } catch (CustomerDoesntHaveActiveException e){
                System.out.println(e.getExMessage());
                return null;
            }
        }
        else {
            return listActiveOrder;
        }
    }
    
    public static boolean removeInvoice(int id){
        for (int i = 0; i < INVOICE_DATABASE.size(); i++){
            if (INVOICE_DATABASE.get(i).getId() == id){
                if (INVOICE_DATABASE.get(i).getIsActive() == true){
                    INVOICE_DATABASE.get(i).setIsActive(false);
                }
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        try {
            throw new InvoiceNotFoundException(id);
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getExMessage());
            return false;
        }
    }
}
