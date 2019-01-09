package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() {
        System.out.println("=================");
        ResponseEntity<ApiResponseMessage> response = restTemplate.getForEntity("/test", ApiResponseMessage.class);
        System.out.println("body = " + response.getBody());
        System.out.println("json = " + response.getBody().getJsonObject());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        System.out.println("=================");
    }

    @Test
    public void jsonTest() {
        String json = "{\"cityCode\":\"DEFHI\",\"countryCode\":\"DE\",\"stateCode\":null,\"cityFileName\":\"Flonheim_DE\",\"cityNameEn\":\"Flonheim\",\"cityNameKo\":\"Flonheim\",\"cityNameJa\":null,\"cityNameZh\":null,\"cityNameFr\":null,\"cityNameEs\":null,\"cityNameDe\":null}";
    }
}
