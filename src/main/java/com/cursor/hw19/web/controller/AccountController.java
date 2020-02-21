package com.cursor.hw19.web.controller;

import com.cursor.hw19.domain.model.Account;
import com.cursor.hw19.domain.model.Profile;
import com.cursor.hw19.service.impl.AccountServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
@NoArgsConstructor
public class AccountController {
    private AccountServiceImpl accountService = new AccountServiceImpl();
    Profile profile = new Profile();

    Account account = new Account(1, "qwe","qwe","qwe","qwe","qwe",1,profile);

    @GetMapping("/")
    public void runApp() {
        accountService.findByFirstName("Sviatoslav");
    }



}
