package com.example.demo.controller;

import com.example.demo.ExResponse;
import com.example.demo.TraportCode;
import com.example.demo.domain.BsCityCode;
import com.example.demo.service.BsCityCodeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BsCityCodeController {

    private final ObjectMapper objectMapper;

    private final BsCityCodeService bsCityCodeService;

    @GetMapping(value = "/test")
    public ResponseEntity<ExResponse> helloWorld() throws JsonProcessingException {
        //ApiResponseMessage message = new ApiResponseMessage("Success", "Hello, World", "", "");
        BsCityCode bsCityCode = bsCityCodeService.getCityCodeByCode("DEFHI");
        //message.setJsonObject(objectMapper.writeValueAsString(bsCityCode));
        return ResponseEntity.ok(
                new ExResponse
                        .Builder<>(null, bsCityCode)
                        .message(TraportCode.SUCCESS)
                        .build());
    }
}
