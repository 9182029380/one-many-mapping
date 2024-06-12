package com.example.Bankingservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Accounts")
public class Accounts {
    @Id
    public int id;
    public int bankCode;
    public String bankname;
    public String  accountNumber;
    public String  accountType;
    public double  balance;
    public String accountholdername;
    public String accountholderaddress;
    public String accountholderphonenumber;
    public String accountholderemail;
    public String accountholderpassword;

}
