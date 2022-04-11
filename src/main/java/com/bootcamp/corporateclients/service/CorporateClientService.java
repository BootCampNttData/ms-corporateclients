package com.bootcamp.corporateclients.service;

import com.bootcamp.corporateclients.model.CorporateClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CorporateClientService {

    Flux<CorporateClient> findAll();
    Mono<CorporateClient> create(CorporateClient corporateClient);
    Flux<CorporateClient> getByDocumentId(String num);
    Mono<CorporateClient> update(CorporateClient corporateClient);
    Mono<CorporateClient> deleteById(String id);
    Mono delete(CorporateClient corporateClient);
}
