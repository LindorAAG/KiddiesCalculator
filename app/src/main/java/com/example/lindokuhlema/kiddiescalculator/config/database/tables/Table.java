package com.example.lindokuhlema.kiddiescalculator.config.database.tables;

import java.util.ArrayList;

/**
 * Created by LindokuhleMa on 2017/02/16.
 */
public abstract class Table {

    protected abstract String getTableName();
    protected abstract Attribute getPrimaryKey();
    protected abstract ArrayList<Attribute> getAllAttributes();
}
