package com.example.walletspring.controller;

import com.example.walletspring.model.Item;
import com.example.walletspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
