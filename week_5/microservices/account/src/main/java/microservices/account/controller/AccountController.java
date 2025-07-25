package microservices.account.controller;
import microservices.account.model.Account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/accounts")
public class AccountController {
	

	@GetMapping("/{number}")
	public Account getAccount(@PathVariable String number) {
		return new Account("00987987973432","savings",234343.43);
	}
	

}
