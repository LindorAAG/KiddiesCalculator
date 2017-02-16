package com.example.lindokuhlema.kiddiescalculator.config.database.tables_to_query;

import com.example.lindokuhlema.kiddiescalculator.config.database.Converter;
import com.example.lindokuhlema.kiddiescalculator.config.database.tables.tables_to_query.AdditionTable;
import org.junit.Test;

/**
 * Created by LindokuhleMa on 2017/02/16.
 */

public class AdditionTableTest {
    @Test
    public void testAddressTable() throws Exception {
        AdditionTable additionTable = new AdditionTable();
        String query = Converter.toCreateTableQuery(additionTable.getTableName(),additionTable.getAllAttributes());
        System.out.println(query);

    }
}
