package com.bootcamp.corporateclients.controller;

import com.bootcamp.corporateclients.model.CorporateClient;
import com.bootcamp.corporateclients.service.CorporateClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("corporateclnt")
@RequiredArgsConstructor
public class CorporateClientController {
    public final CorporateClientService service;
    @GetMapping
    public Flux<CorporateClient> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{documentId}")
    public Flux<CorporateClient> getByDocumentId(@PathVariable("documentId") String documentId){
        return service.getByDocumentId(documentId);
    }

    @PostMapping
    public Mono<CorporateClient> create(@RequestBody CorporateClient corporateClient){
        return service.create(corporateClient);
    }

    @PostMapping("/update")
    public Mono<CorporateClient> update(@RequestBody CorporateClient corporateClient){
        return service.create(corporateClient);
    }

    @DeleteMapping
    public Mono<CorporateClient> delete(@RequestBody CorporateClient corporateClient){
        return service.delete(corporateClient);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<CorporateClient> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

}