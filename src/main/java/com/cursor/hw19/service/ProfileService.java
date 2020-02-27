package com.cursor.hw19.service;

import org.springframework.stereotype.Service;

@Service
public interface ProfileService {
    void findByCompany(String company);

    void findAll();

    void findDepartmentsByCompany(String company);
}
