package com.example.transactionservice.servicesTiersClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "servicestiers-service",
        url = "https://servicestier.onrender.com"
)
public interface ServicesTiersClient {
     @PostMapping("/doTransaction")
     public ResponseEntity<TiersClientResponse> doTransaction(@RequestBody TiersClientRequest tiersClientRequest);
}
