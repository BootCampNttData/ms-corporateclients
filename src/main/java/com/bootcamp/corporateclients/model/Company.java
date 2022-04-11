package com.bootcamp.corporateclients.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Company {
    @Id
    private String id;
    private String rucNumber;
    private String[] accountHolderRucs;
    private String companyName;
    private String address;
    private String phone;
}
