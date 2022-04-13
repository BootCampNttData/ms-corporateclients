package com.bootcamp.corporateclients.service.impl;

import com.bootcamp.corporateclients.model.Company;
import com.bootcamp.corporateclients.service.CompanyService;
import com.bootcamp.corporateclients.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CompanyServiceImpl implements CompanyService {
    public final CompanyRepository repository;

    @Override
    public Mono<Company> create(Company company) {
        return repository.save(company);
    }

    @Override
    public Mono<Company> update(Company company) {
        return repository.save(company);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(Company company) {
        return repository.delete(company);
    }

    @Override
    public Flux<Company> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Company> getByRucNumber(String rucNumber) {
        return repository.findByRucNumber(rucNumber);
    }

}
