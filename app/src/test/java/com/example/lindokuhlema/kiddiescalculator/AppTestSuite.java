package com.example.lindokuhlema.kiddiescalculator;


import com.example.lindokuhlema.kiddiescalculator.config.database.tables_to_query.AdditionTableTest;
import com.example.lindokuhlema.kiddiescalculator.domain.AdditionDomainTest;
import com.example.lindokuhlema.kiddiescalculator.factories.AdditionFactoryTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionFactoryTest.class,
        AdditionDomainTest.class,
        AdditionTableTest.class
})

public class AppTestSuite {

}