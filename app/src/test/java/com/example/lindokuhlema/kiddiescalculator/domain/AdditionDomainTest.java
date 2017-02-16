package com.example.lindokuhlema.kiddiescalculator.domain;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public class AdditionDomainTest {
    @Test
    public void testAdditionCreation()
    {
        Addition addition = new Addition.Builder()
                .id(1L)
                .num1(1)
                .num2(5)
                .build();

        Assert.assertNotNull(addition);
        Assert.assertEquals(addition.getId(),1L);
        Assert.assertEquals(addition.getNum1(),1);
        Assert.assertEquals(addition.getNum2(),5);
    }
}
