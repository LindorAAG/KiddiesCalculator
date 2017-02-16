package com.example.lindokuhlema.kiddiescalculator.domain;

import java.io.Serializable;

/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public class Addition implements Serializable{
    private long id;
    private int num1;
    private int num2;
    private int sum;

    public Addition(Builder builder){
        id = builder.id;
        num1 = builder.num1;
        num2 = builder.num2;
    }

    public long getId() {
        return id;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getSum() {
        return sum;
    }

    public int add(){
        sum = num1 + num2;
        return sum;
    }

    public static class Builder {
        private long id;
        private int num1;
        private int num2;

        public Builder id(long value) {
            this.id = value;
            return this;
        }

        public Builder num1(int value){
            this.num1 = value;
            return  this;
        }

        public Builder num2(int value){
            this.num2 = value;
            return this;
        }


        public Builder copy(Addition value)
        {
            this.id = value.getId();
            this.num1 = value.getNum1();
            this.num2 = value.getNum2();
            return this;
        }
        public Addition build(){return new Addition(this);}
    }
}
