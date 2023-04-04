package com.Spring_Demo.Spring_Demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("add")
public class Addition implements Operations {
    @Override
    @Bean
    public int operate(int num1, int num2) {
        return num1+num2;
    }
//    public int add(int num1, int num2) {
//        return num1 + num2;
//    }
}
