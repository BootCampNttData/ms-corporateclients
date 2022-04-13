package com.bootcamp.corporateclients.controller;

import com.bootcamp.corporateclients.model.Company;
import com.bootcamp.corporateclients.model.CorporateClient;
import com.bootcamp.corporateclients.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {
    public final CompanyService service;
    @GetMapping
    public Flux<Company> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{rucNumber}")
    public Flux<Company> getByDocumentId(@PathVariable("rucNumber") String rucNumber){
        return service.getByRucNumber(rucNumber);
    }

    /**
     * Valida que exista por lo menos un Titular para la Compañia
     * en caso de no tener ninguno se retorna un objeto nulo
     * y no se guarda en BD
     * @param corporateClient
     * @return
     */
    @PostMapping
    public Mono<Company> create(@RequestBody Company corporateClient){
        if(corporateClient.getAccountHolderDocId().length > 0){
            return service.create(corporateClient);
        }
        return Mono.just(new Company());
    }




    @PostMapping("/update")
    public Mono<Company> update(@RequestBody Company corporateClient){
        return service.create(corporateClient);
    }

    @DeleteMapping
    public Mono<Company> delete(@RequestBody Company corporateClient){
        return service.delete(corporateClient);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<Company> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }


    private String helloMessage() {
        return "Hello! ";
    }
}