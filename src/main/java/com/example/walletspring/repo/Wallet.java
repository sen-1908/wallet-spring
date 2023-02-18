package com.example.walletspring.repo;

import com.example.walletspring.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//ItemクラスをDBと繋げられるようにする
@Repository
public interface Wallet extends CrudRepository<Item,Long> {
}
