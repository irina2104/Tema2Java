package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator {
    public Integer factorial(Integer n){
        Integer f=1;
        if (n==0 || n==1) f=1;
        for(Integer i=2;i<=n;i++){
            f*=i;}
        return f;
    }
}
