package com.bootcamp.corporateclients.repository;

import com.bootcamp.corporateclients.model.CorporateClient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
public interface CorporateClientRepository extends ReactiveCrudRepository<CorporateClient, String> {
  Flux<CorporateClient> findByDocumentId(String num);
}
