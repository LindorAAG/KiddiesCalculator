package com.example.lindokuhlema.kiddiescalculator.factories;

import com.example.lindokuhlema.kiddiescalculator.domain.Addition;

/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public class AdditionFactory {
    public static Addition getNumbers(long id, int num1, int num2){
        return new Addition.Builder()
                .id(id)
                .num1(num1)
                .num2(num2)
                .build();
    }
}
