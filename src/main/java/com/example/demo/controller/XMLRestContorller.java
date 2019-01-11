package com.example.demo.controller;

import com.example.demo.ExResponse;
import com.example.demo.TraportCode;
import com.example.demo.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class XMLRestContorller {

    @GetMapping(value = "/customer",headers = { "Accept=application/xml" }, produces ={MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ExResponse> getCustomer(){
        Customer customer= new Customer(30, "son", "seungwoo");
        return ResponseEntity.ok(
                new ExResponse
                        .Builder<>(null, customer)
                        .message(TraportCode.SUCCESS)
                        .build());
    }
}
