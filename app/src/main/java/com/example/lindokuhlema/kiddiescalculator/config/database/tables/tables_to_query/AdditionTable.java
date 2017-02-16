package com.example.lindokuhlema.kiddiescalculator.config.database.tables.tables_to_query;

import com.example.lindokuhlema.kiddiescalculator.config.database.tables.Attribute;
import com.example.lindokuhlema.kiddiescalculator.config.database.tables.Table;

import java.util.ArrayList;

/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public class AdditionTable extends Table {
    private final String tableName = "addition";
    private final Attribute id = new Attribute("id", "INTEGER");
    private final Attribute num1 = new Attribute("First Number", "INTEGER");
    private final Attribute num2 = new Attribute("Second Number", "INTEGER");
    private final Attribute sum = new Attribute("Sum", "INTEGER");

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public Attribute getPrimaryKey() {
        return id;
    }

    public Attribute getAttributeId() {
        return id;
    }

    public Attribute getAttributeNum1() {
        return num1;
    }

    public Attribute getAttributeNum2() {
        return num2;
    }

    public Attribute getAttributeSum() {
        return sum;
    }

    @Override
    public ArrayList<Attribute> getAllAttributes() {

        ArrayList<Attribute> attributes = new ArrayList<>();
        attributes.add(id);
        attributes.add(num1);
        attributes.add(num2);
        attributes.add(sum);

        return  attributes;
    }
}
