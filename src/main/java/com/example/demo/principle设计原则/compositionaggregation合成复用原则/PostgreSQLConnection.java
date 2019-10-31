package com.example.demo.principle设计原则.compositionaggregation合成复用原则;

public class PostgreSQLConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
