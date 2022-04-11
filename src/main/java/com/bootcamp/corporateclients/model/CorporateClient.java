package com.bootcamp.corporateclients.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CorporateClient {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String documentId;
    private String documentType;
    private String address;
    private String phone;
    private String maritalStatus;
    private String gender;
}
