package com.swz.skankhunt.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //组件注解，会被自动扫描，注册生成bean
public class SkakProperties {

    @Value("${skankhunt.m416}")
    private String m416;

    @Value("${skankhunt.awm}")
    private String awm;

    public String getM416() {
        return m416;
    }

    public void setM416(String m416) {
        this.m416 = m416;
    }

    public String getAwm() {
        return awm;
    }

    public void setAwm(String awm) {
        this.awm = awm;
    }
}
