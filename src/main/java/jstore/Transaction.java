package jstore;

import java.util.*;
import java.util.stream.*;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
    }

    public static void orderNewItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void orderSecondItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void orderRefurbishedItem(ArrayList<Integer> item_list){
        Invoice invoice = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer) {
        Invoice invoice = new Sell_Paid(item_list, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer)
    {
        Invoice invoice = new Sell_Unpaid(item_list, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod)
    {
        Invoice invoice = new Sell_Installment(item_list, customer, installmentPeriod);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static boolean finishTransaction(Invoice invoice){
        //DatabaseInvoice.getInvoiceDatabase().contains(invoice)
        if (DatabaseInvoice.getInvoice(invoice.getId()).equals(invoice) &&
                (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) ||
                        invoice.getInvoiceStatus().equals(InvoiceStatus.Installment))){
            invoice.setIsActive(false);
            System.out.println("#### Finish Transaction ####");
            System.out.println("Invoice ID: " + invoice.getId());
            System.out.println("isActive: " + invoice.getIsActive() + "\n");
            return true;
        }
        return false;
    }
    
    public static boolean cancelTransaction(Invoice invoice){
        //DatabaseInvoice.getInvoiceDatabase().contains(invoice)
        if (DatabaseInvoice.getInvoice(invoice.getId()).equals(invoice) &&
                (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) ||
                        invoice.getInvoiceStatus().equals(InvoiceStatus.Installment))){
            System.out.println("#### Cancel Transaction ####");
            System.out.println("Invoice ID: " + invoice.getId());
            System.out.println("Removed from database." + "\n");
            DatabaseInvoice.removeInvoice(invoice.getId());
            return true;
        }
        return false;
    }
}
