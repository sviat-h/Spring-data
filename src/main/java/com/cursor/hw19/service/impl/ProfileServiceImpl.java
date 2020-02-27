package com.cursor.hw19.service.impl;

import com.cursor.hw19.domain.model.Profile;
import com.cursor.hw19.domain.repository.ProfileRepository;
import com.cursor.hw19.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private
    ProfileRepository profileRepository;

    @Override
    public void findByCompany(String company) {
        List<Profile> profileList = profileRepository.findByCompany(company);
        System.out.println(profileList);
    }

    @Override
    public void findAll() {
        List<Profile> profileList = profileRepository.findAll();

        System.out.println(profileList);
    }

    @Override
    public void findDepartmentsByCompany(String company) {
        List<String> departments = profileRepository.findDepartmentsByCompany(company);

        System.out.println("The company '" + company + "' has: " + departments + " department(s).");
    }
}
