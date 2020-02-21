package com.cursor.hw19.domain.repository;

import com.cursor.hw19.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findByFirstName(String firstName);
    void addAccount(Account account);

}
