package com.bootcamp.corporateclients.repository;

import com.bootcamp.corporateclients.model.Company;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CompanyRepository extends ReactiveCrudRepository<Company, String> {
    Flux<Company> findByRucNumber(String ruc);
}
