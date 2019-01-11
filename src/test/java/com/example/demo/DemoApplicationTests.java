package com.example.demo;

import com.example.demo.domain.BsCityCode;
import com.example.demo.service.BsCityCodeService;
import com.example.demo.service.ProcedureServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DemoApplicationTests {

    @Autowired
    BsCityCodeService cityCodeService;

    @Autowired
    ProcedureServiceImpl procedureServiceImpl;

    @Test
    public void 도시코드로조회() {
        BsCityCode cityCode = cityCodeService.getCityCodeByCode("DEFIL");
        log.debug("===============================");
        log.debug("cityCode : {}", cityCode);
        log.debug("===============================");
    }

    @Test
    public void 도시코드전체목록() {
        List<BsCityCode> cityCodeList = cityCodeService.getCityCode();
        log.debug("===============================");
        log.debug("cityCodeList : {}", cityCodeList);
        log.debug("===============================");
    }

    @Test
    public void 도시파일명으로조회() {
        List<BsCityCode> cityCodeList = cityCodeService.findByName("Fellheim_DE");
        log.debug("===============================");
        log.debug("cityCodeList : {}", cityCodeList);
        log.debug("===============================");
    }

    @Test
    public void P_XML_SELECT_프로시저호출() throws JSONException {
        Map map = procedureServiceImpl.mapProcedureList();
        log.debug("===============================");
        log.debug("resultList : {}", map.get("resultList"));
        log.debug("===============================");
    }

}

