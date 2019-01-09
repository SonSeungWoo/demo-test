package com.example.demo.service;

import com.example.demo.domain.BsCityCode;
import com.example.demo.mapper.BsCityCodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BsCityCodeService {

    private final BsCityCodeMapper cityCodeMapper;

    public BsCityCode getCityCodeByCode(String cityCode){
        return cityCodeMapper.selectCityCodeByCityCode(cityCode);
    }

    public List<BsCityCode> getCityCode() {
        return cityCodeMapper.selectCityCode();
    }

    public List<BsCityCode> findByName(String name){
        return cityCodeMapper.findByName(name);
    }
}
