package com.Spring_Demo.Spring_Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator{
   @Autowired
   @Qualifier("sub")
    private Operations operation;

//    public Calculator(Operations operation) {
//        this.operation = operation;
//    }

    public int perform(int num1, int num2) {
        return operation.operate(num1, num2);
    }
//    public int add(int num1, int num2) {
//        Addition addition = new Addition();
//        return addition.add(num1, num2);
//    }
}