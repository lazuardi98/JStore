package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController
{
    @RequestMapping("/items")
    public ArrayList<Item> itemsList(){
        return DatabaseItem.getItemDatabase();
    }

    @RequestMapping("/items/{id_item}")
    public Item getItem(@PathVariable int id_item){
        return DatabaseItem.getItemFromID(id_item);
    }
}
