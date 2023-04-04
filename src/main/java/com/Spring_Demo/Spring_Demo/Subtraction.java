package com.Spring_Demo.Spring_Demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sub")
public class Subtraction implements Operations{
    @Override
    public int operate(int num1, int num2) {
        return num1-num2;
    }
}
