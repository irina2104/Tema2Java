package com.endava.test;

import com.endava.calculator.BasicCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;

public class AddTest {
    BasicCalculator basicCalculator;
    @BeforeTest()
    public void newCalc(){
        basicCalculator = new BasicCalculator();

    }
        @Test(suiteName = "add suite")
        public void addIntIT() {
            Assert.assertEquals(basicCalculator.add(4,2),new Long(6));
        }
        @Test
        public void addDoubleIT() {
            Assert.assertEquals(basicCalculator.add(4.1, 2.2), new Double(6.3));
        }
        @Test
        public void addInt1IT(){assertThat(basicCalculator.add(1,2)).isEqualTo(3);}
        @Test
        public void addInt2IT(){assertThat(basicCalculator.add(1,1)).isGreaterThan(1);}
        @Test
        public void addInt3IT(){assertThat(basicCalculator.add(3,4)).isNotNegative();}
        @Test
        public void addInt4IT(){assertThat(basicCalculator.add(1,0)).isOne();}

        @Test
        public void addDouble1IT(){assertThat(basicCalculator.add(1.1,2.2)).isGreaterThanOrEqualTo(3.2);}
        @Test
        public void addDouble2IT(){assertThat(basicCalculator.add(0.5,5.5)).isBetween(0.1,6.5);}
        @Test
        public void addDouble3IT(){assertThat(basicCalculator.add(-1.4,5.4)).isNotNegative();}
        @Test
        public void addDouble4IT(){assertThat(basicCalculator.add(-7.1,-2.3)).isLessThan(0);}

}


