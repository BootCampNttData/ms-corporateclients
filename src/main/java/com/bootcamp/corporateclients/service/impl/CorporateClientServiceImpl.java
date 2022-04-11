package com.bootcamp.corporateclients.service.impl;

import com.bootcamp.corporateclients.model.CorporateClient;
import com.bootcamp.corporateclients.service.CorporateClientService;
import com.bootcamp.corporateclients.repository.CorporateClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CorporateClientServiceImpl implements CorporateClientService {
    public final CorporateClientRepository repository;

    @Override
    public Mono<CorporateClient> create(CorporateClient corporateClient) {
        return repository.save(corporateClient);
    }

    @Override
    public Mono<CorporateClient> update(CorporateClient corporateClient) {
        return repository.save(corporateClient);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(CorporateClient corporateClient) {
        return repository.delete(corporateClient);
    }

    @Override
    public Flux<CorporateClient> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<CorporateClient> getByDocumentId(String document) {
        return repository.getByDocumentId(document);
    }
    
}
