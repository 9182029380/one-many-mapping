package com.example.Bankingservices.controller;

import com.example.Bankingservices.dto.Bankinforequest;
import com.example.Bankingservices.model.BankInfo;
import com.example.Bankingservices.repository.AccountRepository;
import com.example.Bankingservices.repository.BankInforepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharathbank")
public class BankController {
    @Autowired
    private BankInforepository bankrepo;
    @Autowired
    private AccountRepository accountrepo;

    @PostMapping("/addaccounts")
    public BankInfo addaccounts(@RequestBody Bankinforequest bank){
        return bankrepo.save(bank.getBankinfo());
    }
}
