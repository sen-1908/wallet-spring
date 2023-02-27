package com.example.walletspring.controller;

import com.example.walletspring.model.Item;
import com.example.walletspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controllerの機能+@Requestの省略を可能にする
@RestController
//CORSの設定
@CrossOrigin


public class mainController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }


    @PostMapping("/")
    public  void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/{ItemId}")
    public void updateItem(@RequestBody Item item,@PathVariable("itemId") Long itemId) {
        itemService.updateItem(itemId,item);
    }

    @DeleteMapping("/{ItemId}")
    public void deleteItem(@PathVariable("ItemId") Long ItemId) {
        itemService.deleteItem(ItemId);
    }

}
