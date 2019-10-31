package com.example.demo.principle设计原则.compositionaggregation合成复用原则;

public class MySQLConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
