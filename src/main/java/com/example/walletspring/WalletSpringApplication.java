package com.example.walletspring;

import com.example.walletspring.model.Item;
import com.example.walletspring.repo.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletSpringApplication implements CommandLineRunner {

	@Autowired
	Wallet wallet;

	public static void main(String[] args) {
		SpringApplication.run(WalletSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		wallet.save(new Item("お小遣い",100000));
		wallet.save(new Item("家賃",-4000,"10月分"));
		wallet.save(new Item("ガソリン代",-5000,"10月分"));
		wallet.save(new Item("電気代",-2000,"10月分"));
	}

}
