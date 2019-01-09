package com.example.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponseMessage implements Serializable {
    // HttpStatus
    private String status;
    // Http Default Message
    private String message;
    // Error Message to USER
    private String errorMessage;
    // Error Code
    private String errorCode;

    private String jsonObject;

    public ApiResponseMessage() {
    }

    public ApiResponseMessage(String status, String message, String errorCode, String errorMessage) {
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
