package com.cursor.hw19.web.controller;

import com.cursor.hw19.service.impl.AccountServiceImpl;
import com.cursor.hw19.service.impl.ProfileServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@CrossOrigin
//@RequestMapping("/api/accounts")
@AllArgsConstructor
@NoArgsConstructor
public class ProfileController {
    @Autowired
    private ProfileServiceImpl profileService;

    //    @GetMapping("/")
    @Autowired
    public void runApp() {
        System.out.println("\n");

        profileService.findByCompany("Skaboo");

        System.out.println("\n");
    }
}
