package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SupplierController
{
    @RequestMapping("/suppliers")
    public ArrayList<Supplier> suppliersList(){
        return DatabaseSupplier.getSupplierDatabase();
    }

    @RequestMapping("/suppliers/{id_supplier}")
    public Supplier getSupplier(@PathVariable int id_supplier){
        return DatabaseSupplier.getSupplier(id_supplier);
    }
}
