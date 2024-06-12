package com.example.Bankingservices.dto;

import com.example.Bankingservices.model.BankInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bankinforequest {
    public BankInfo bankinfo;


}
