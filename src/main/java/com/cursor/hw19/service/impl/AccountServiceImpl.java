package com.cursor.hw19.service.impl;

import com.cursor.hw19.domain.model.Account;
import com.cursor.hw19.domain.repository.AccountRepository;
import com.cursor.hw19.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public void findByFirstName(String firstName) {
        List<Account> byFirstName = accountRepository.findByFirstName(firstName);
    }

}
