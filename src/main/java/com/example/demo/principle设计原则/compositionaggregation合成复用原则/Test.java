package com.example.demo.principle设计原则.compositionaggregation合成复用原则;

public class Test {

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        dao.setDbConnection(new MySQLConnection());
        dao.setDbConnection(new PostgreSQLConnection());
        dao.addProduct();
    }

}
