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
public class BsCityCodeServiceImpl implements BsCityCodeService {

    private final BsCityCodeMapper cityCodeMapper;

    @Override
    public BsCityCode getCityCodeByCode(String cityCode) {
        return cityCodeMapper.getCityCodeByCode(cityCode);
    }

    @Override
    public List<BsCityCode> getCityCode() {
        return cityCodeMapper.getCityCode();
    }

    @Override
    public List<BsCityCode> findByName(String name) {
        return cityCodeMapper.findByName(name);
    }
}
