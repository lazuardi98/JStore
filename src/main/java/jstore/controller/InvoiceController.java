package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvoiceController
{
    @RequestMapping("/invoicecustomer/{id_customer}")
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer){
        return DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
    }

    @RequestMapping("/invoice/{id_invoice}")
    public Invoice getInvoice(@PathVariable int id_invoice){
        return DatabaseInvoice.getInvoice(id_invoice);
    }

    @RequestMapping(value = "/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam ArrayList<Integer> listItem,
                                     @RequestParam(value="id_customer") int id_customer)
    {
        Invoice invoice = new Sell_Paid(listItem, DatabaseCustomer.getCustomer(id_customer));
        DatabaseInvoice.addInvoice(invoice);
        if (DatabaseInvoice.getInvoiceDatabase().contains(invoice)){
            return invoice;
        }
        else {
            return null;
        }
    }

    @RequestMapping(value = "/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam ArrayList<Integer> listItem,
                                       @RequestParam(value="id_customer") int id_customer)
    {
        Invoice invoice = new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(id_customer));
        DatabaseInvoice.addInvoice(invoice);
        if (DatabaseInvoice.getInvoiceDatabase().contains(invoice)){
            return invoice;
        }
        else {
            return null;
        }
    }

    @RequestMapping(value = "/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam ArrayList<Integer> listItem,
                                            @RequestParam(value="id_customer") int id_customer,
                                            @RequestParam(value="installment") int installment_period)
    {
        Invoice invoice = new Sell_Installment(listItem, DatabaseCustomer.getCustomer(id_customer), installment_period);
        DatabaseInvoice.addInvoice(invoice);
        if (DatabaseInvoice.getInvoiceDatabase().contains(invoice)){
            return invoice;
        }
        else {
            return null;
        }
    }

    @RequestMapping(value = "/canceltransaction", method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value="id_invoice") int id_invoice){
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(id_invoice));
        return DatabaseInvoice.getInvoice(id_invoice);
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value="id_invoice") int id_invoice){
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(id_invoice));
        return DatabaseInvoice.getInvoice(id_invoice);
    }
}
