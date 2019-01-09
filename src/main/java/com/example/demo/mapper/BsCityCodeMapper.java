package com.example.demo.mapper;

import com.example.demo.domain.BsCityCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BsCityCodeMapper {

    BsCityCode selectCityCodeByCityCode(String cityCode);

    List<BsCityCode> selectCityCode();

    @Select("select * from BTMS.BS_CITY_CODE where CITY_FILE_NAME = #{name}")
    List<BsCityCode> findByName(@Param("name") String name);
}
