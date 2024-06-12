package com.example.Bankingservices.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BankinfoResponse {
    public String bankName;
    public String ifscCode;
    public String branch;
    public String accountholdername;
    public String accountholderaddress;
    public String accountholderphonenumber;
    public String accountholderemail;



}
