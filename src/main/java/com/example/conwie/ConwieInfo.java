package com.example.conwie;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConwieInfo implements InfoContributor{

    @Override
    public void contribute(Info.Builder builder) {
        Map<String,Object> info = new HashMap<>();
        info.put("email","zhaokangwei@163.com");
        builder.withDetail("author", info);

    }
}
