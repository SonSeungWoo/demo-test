package com.example.demo.controller;

import com.example.demo.ApiResponseMessage;
import com.example.demo.domain.BsCityCode;
import com.example.demo.mapper.BsCityCodeMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BsCityCodeController {

    private final BsCityCodeMapper bsCityCodeMapper;

    private final ObjectMapper objectMapper;

    @GetMapping(value = "/test")
    public ResponseEntity<ApiResponseMessage> helloWorld() throws JsonProcessingException {
        ApiResponseMessage message = new ApiResponseMessage("Success", "Hello, World", "", "");
        BsCityCode bsCityCode = bsCityCodeMapper.selectCityCodeByCityCode("DEFHI");
        message.setJsonObject(objectMapper.writeValueAsString(bsCityCode));
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
