package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface XmlTestMapper {

    void mapProcedureList(Map map);

}
