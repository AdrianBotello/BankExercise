package com.bankexercise.solerabankexercise.account;

import com.bankexercise.solerabankexercise.user.User;
import com.bankexercise.solerabankexercise.errorhandling.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class AccountResource {

    private AccountDaoService service;

    public AccountResource(AccountDaoService service) {
        this.service = service;
    }

    @GetMapping("/accounts")
    public List<Account> retrieveAllAccounts(){
        return service.findAll();
    }
    @GetMapping("/accounts/{accountNumber}")
    public Account retrieveAnAccount(@PathVariable int accountNumber){
        Account account =  service.findOneAccount(accountNumber);
        if (account == null){
            throw new UserNotFoundException("id "+ accountNumber);
        }
        return account;
    }

    @DeleteMapping("/accounts/{accountNumber}")
    public void deleteAnAccount(@PathVariable int accountNumber){
        service.deleteByaccountNumber(accountNumber);
    }
    @PostMapping("/accounts")
    public ResponseEntity<User> createUser(@RequestBody Account account){
        Account savedAccount = service.save(account);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{accountNumber}")
                .buildAndExpand(savedAccount.getAccountNumber())
                .toUri();
        return ResponseEntity.created(location).build();

    }
}
