package com.example.walletspring.model;

import jakarta.persistence.*;

//databaseのデータを使用できるようにする
@Entity
@Table(name = "wallet_items")
public class Item {

    /**
     * ＠Id	主キーであることを示す（Unique、Not Null も付与）
     * ＠GeneratedValue	値を自動生成する（= Auto Increment）
     */
    //クラスをDBに入れる際にIDを自動生成する
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int money;
    private String appendix;

    //Entityクラスは空のコンストラクターが必要
    public Item(){}

    public Item(String name, int money, String appendix) {
        this.name = name;
        this.money = money;
        this.appendix = appendix;
    }

    public Item(String name, int money) {
        this.name = name;
        this.money = money;
        this.appendix = "N/A";
    }

    /**
     * getterでDBからフロントにデータを送る
     * setterでDBからバックにデータを送る
     *
     */
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }
}
