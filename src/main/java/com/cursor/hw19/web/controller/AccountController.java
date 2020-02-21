package com.cursor.hw19.web.controller;

import com.cursor.hw19.service.impl.AccountServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
@NoArgsConstructor
public class AccountController {
    private AccountServiceImpl accountService = new AccountServiceImpl();

    @GetMapping("/")
    public void runApp() {
        accountService.findByFirstName("Sviatoslav");
    }


}
