package com.bootcamp.corporateclients.service;

import com.bootcamp.corporateclients.model.Company;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompanyService {

    Flux<Company> findAll();
    Mono<Company> create(Company company);
    Flux<Company> getByDocumentId(String num);
    Mono<Company> update(Company company);
    Mono<Company> deleteById(String id);
    Mono delete(Company company);

}
