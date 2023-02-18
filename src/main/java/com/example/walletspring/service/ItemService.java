package com.example.walletspring.service;

import com.example.walletspring.model.Item;
import com.example.walletspring.repo.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 実際のControllerの処理を行う場所
 */
@Service
public class ItemService {
    @Autowired
    private Wallet wallet;

    public List<Item> getAllItems() {
        List<Item> allItems = new ArrayList<>();
        //foreachを使わなくても使用可能
        wallet.findAll().forEach(allItems::add);
        return allItems;
    }
}
