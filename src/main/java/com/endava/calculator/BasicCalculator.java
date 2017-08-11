package com.endava.calculator;

public class BasicCalculator implements Calculator {

    @Override
    public Long add(Long a, Long b, Long... list) {
        Long c = a + b;
        for (Long i : list) {
            c += i;
        }
        return c;
    }

    @Override
    public Double add(Double a, Double b, Double... list) {
        Double c = a + b;
        for (Double i : list) {
            c += i;
        }
        return c;
    }

    @Override
    public Long add(Integer a, Integer b, Integer... list) {
        Integer c = a + b;
        for (Integer i : list) {
            c += i;
        }
        return c.longValue();
    }

    @Override
    public Integer factorial(Integer n) {
        throw new RuntimeException("This method is not implemented");
    }

}
