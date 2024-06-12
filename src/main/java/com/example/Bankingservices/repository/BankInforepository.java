package com.example.Bankingservices.repository;

import com.example.Bankingservices.model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInforepository extends JpaRepository<BankInfo,Integer> {
}
