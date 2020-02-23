package com.cursor.hw19.domain.repository;

import com.cursor.hw19.domain.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    List<Profile> findByCompany(String company);

    List<Profile> findAll();
}
