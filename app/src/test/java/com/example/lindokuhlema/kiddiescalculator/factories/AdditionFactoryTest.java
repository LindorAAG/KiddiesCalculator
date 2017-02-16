package com.example.lindokuhlema.kiddiescalculator.factories;

import com.example.lindokuhlema.kiddiescalculator.domain.Addition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public class AdditionFactoryTest {
    private Addition addition;

    @Before
    public void setUp() throws Exception {
        addition = AdditionFactory.getNumbers(1L,2,8);
        addition.add();
    }

    @Test
    public void testAddition() throws Exception {
        Assert.assertNotNull(addition);
        Assert.assertEquals(2, addition.getNum1());
        System.out.print("The sum of " + addition.getNum1() + " and " + addition.getNum2() + " is " + addition.getSum() + "\n");
    }

    @Test
    public void testAdditionUpdate() throws Exception {
        Addition newSum = new Addition.Builder().copy(addition).num1(4).build();
        Assert.assertEquals(4, newSum.getNum1());
        newSum.add();
        System.out.print("The sum of " + newSum.getNum1() + " and " + newSum.getNum2() + " is " + newSum.getSum());
    }
}

