package com.example.demo.service;

import com.example.demo.domain.XmlTest;
import com.example.demo.mapper.XmlTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class XmlTestService {

    private final XmlTestMapper xmlTestMapper;

    public XmlTest getXmlString(String input){
        return xmlTestMapper.getXmlString(input);
    }
}
