package com.example.demo;

import java.util.Collection;

public class ExResponse<T> {
    private String tid;
    private int statusCode;
    private String message;
    private Collection<T> data;
    private T datum;

    private ExResponse(ExResponse.Builder<T> builder) {
        this.tid = builder.tid;
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.data = builder.data;
        this.datum = builder.datum;
    }

    public String getTid() {
        return this.tid;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public Collection<T> getData() {
        return this.data;
    }

    public T getDatum() {
        return this.datum;
    }

    public static class Builder<T> {
        private String tid;
        private int statusCode;
        private String message;
        private Collection<T> data;
        private T datum;

        public Builder(String tid, Collection<T> data) {
            this.tid = tid;
            this.data = data;
        }

        public Builder(String tid, T datum) {
            this.tid = tid;
            this.datum = datum;
        }

        public ExResponse.Builder message(TraportCode traportCode) {
            this.statusCode = traportCode.getCode();
            this.message = traportCode.getMessage();
            return this;
        }

        public ExResponse build() {
            return new ExResponse<>(this);
        }
    }
}
