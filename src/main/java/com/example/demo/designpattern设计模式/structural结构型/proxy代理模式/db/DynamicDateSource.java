package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Spring分库的具体实现
 */
public class DynamicDateSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
