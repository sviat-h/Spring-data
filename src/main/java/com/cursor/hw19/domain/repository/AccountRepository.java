package com.cursor.hw19.domain.repository;

import com.cursor.hw19.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findByFirstName(String firstName);

    List<Account> findAll();

    @Query(value = "select first_name from accounts where id=:id", nativeQuery = true)
    String findFirstNameById(@Param("id") Integer id);
}
