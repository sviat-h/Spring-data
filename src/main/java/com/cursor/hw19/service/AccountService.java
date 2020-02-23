package com.cursor.hw19.service;

import org.springframework.stereotype.Service;

@Service
public interface AccountService {
     void findByFirstName(String firstName);

     void findAll();
}
