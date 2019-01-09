package com.example.demo.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("test")
public class XmlTest {
    private String vXmlstring;
    private String vInputstring;
}
