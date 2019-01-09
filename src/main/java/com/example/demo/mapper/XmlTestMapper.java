package com.example.demo.mapper;

import com.example.demo.domain.XmlTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XmlTestMapper {
    XmlTest getXmlString(String input);
}
