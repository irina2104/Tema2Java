package com.endava.test;

import com.endava.calculator.ExpertCalculator;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


//import org.junit.Assert;
//import org.junit.Test;

public class FactorialTest {
    ExpertCalculator expertCalculator;
    @BeforeTest()
    public void newExpCalc(){
        expertCalculator = new ExpertCalculator();}

    @Test(suiteName = "factorial suite")
        public void factorialIT(){
                assertEquals(expertCalculator.factorial(3), new Integer(6));
    }
    @Test
    public void factorial1IT(){
        assertEquals((Integer)6, expertCalculator.factorial(3));    }

    @Test
    public void factorial2IT(){
        assertThat(expertCalculator.factorial(5), is(equalTo(120)));
    }

    @Test
    public void factorial3IT(){
        assertThat(expertCalculator.factorial(6),is(not(equalTo(120))));
    }

    @Test
    public void factorial4IT(){
        assertThat(expertCalculator.factorial(4),is(greaterThan(15)));
    }

    @Test
    public void factorial5IT(){
        assertThat(expertCalculator.factorial(7),is(lessThan(10000)));
    }



}
