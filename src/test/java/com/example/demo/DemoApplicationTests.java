package com.example.demo;

import com.example.demo.domain.BsCityCode;
import com.example.demo.domain.XmlTest;
import com.example.demo.service.BsCityCodeService;
import com.example.demo.service.XmlTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DemoApplicationTests {

    @Autowired
    BsCityCodeService cityCodeService;

    @Autowired
    XmlTestService xmlTestService;

    @Test
    public void contextLoads() {
        BsCityCode cityCode = cityCodeService.getCityCodeByCode("DEFIL");
        log.debug("===============================");
        log.debug("cityCode : {}", cityCode);
        log.debug("===============================");
    }

    @Test
    public void findAll() {
        List<BsCityCode> cityCodeList = cityCodeService.getCityCode();
        log.debug("===============================");
        log.debug("cityCodeList : {}", cityCodeList);
        log.debug("===============================");
    }

    @Test
    public void findByName(){
        List<BsCityCode> cityCodeList = cityCodeService.findByName("Fellheim_DE");
        log.debug("===============================");
        log.debug("cityCodeList : {}", cityCodeList);
        log.debug("===============================");
    }

    @Test
    public void xmlTest(){
        String input = "<Input Code=\"5J\"/>";
        xmlTestService.getXmlString(input);
        log.debug("===============================");
        //log.debug("xmlTest : {}", xmlTest);
        log.debug("===============================");
    }

}

