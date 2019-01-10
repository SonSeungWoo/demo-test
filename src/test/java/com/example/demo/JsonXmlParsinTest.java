package com.example.demo;

import com.github.underscore.lodash.U;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonXmlParsinTest {

    @Test
    public void XML을JSON으로파싱() {
        String xmlString = "<XML_SELECT><AirLineCode AirLineCode=\"5J\"></AirLineCode><AirLineCode AirLineCode=\"5J\"></AirLineCode><AirLineCode AirLineCode=\"5J\"></AirLineCode><AirLineName AirLineName=\"Cebu Pacific\"></AirLineName><AirLineName AirLineName=\"Cebu Pacific\"></AirLineName><AirLineName AirLineName=\"Cebu Pacific\"></AirLineName></XML_SELECT>";
        JSONObject jsonObject = XML.toJSONObject(xmlString);
        log.debug("===============================");
        log.debug("cityCode : {}", jsonObject.toString());
        log.debug("===============================");
    }

    @Test
    public void JSON을XML로파싱() {
        String json = "{\"cityCode\":\"DEFHI\",\"countryCode\":\"DE\",\"stateCode\":null,\"cityFileName\":\"Flonheim_DE\",\"cityNameEn\":\"Flonheim\",\"cityNameKo\":\"Flonheim\",\"cityNameJa\":null,\"cityNameZh\":null,\"cityNameFr\":null,\"cityNameEs\":null,\"cityNameDe\":null}";
        String xml = U.jsonToXml(json);
        System.out.println(xml);

    }
}
