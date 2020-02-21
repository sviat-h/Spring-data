package com.cursor.hw19;

import com.cursor.hw19.web.controller.AccountController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw19SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hw19SpringDataApplication.class, args);

        new AccountController().runApp();
    }

}
