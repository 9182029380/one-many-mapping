package com.example.Bankingservices.repository;

import com.example.Bankingservices.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, Integer>{

}
