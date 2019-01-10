package com.example.demo.service;

import com.example.demo.mapper.XmlTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class XmlTestService {

    private final XmlTestMapper xmlTestMapper;

    public Map mapProcedureList() {
        Map map = new HashMap();
        map.put("vInputstring", "<Input Code=\"5J\"/>");
        xmlTestMapper.mapProcedureList(map);
        return map;
    }
}
