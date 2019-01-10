package com.example.demo.service;

import com.example.demo.domain.BsCityCode;

import java.util.List;

public interface BsCityCodeService {

    BsCityCode getCityCodeByCode(String cityCode);

    List<BsCityCode> getCityCode();

    List<BsCityCode> findByName(String name);
}
