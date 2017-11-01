package brains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import static brains.accounts.api.AccountRequestMethods.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import brains.accounts.api.AccountData;
import brains.accounts.dao.AccountsOrm;

@RestController
@SpringBootApplication
@ImportResource("classpath:beans.xml")

public class BrainsRestController {

	@Autowired
	AccountsOrm accounts;

	@RequestMapping(value = "CHECK")
	public String checkAuthentification() {
		return "OK";
	}

	@RequestMapping(value = ADD_ACCOUNT, method = RequestMethod.POST)
	public boolean addAccount(@RequestBody AccountData accountData) {
		return accounts.addAccount(accountData);
	}

	public static void main(String[] args) {
		SpringApplication.run(BrainsRestController.class, args);
		System.out.println("Server is on");
	}

}
