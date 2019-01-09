package com.example.demo;


public enum TraportCode {
    SUCCESS(200, "성공."),
    ERROR(400, "에러");


    private final int code;
    private final String message;


    private TraportCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }
}