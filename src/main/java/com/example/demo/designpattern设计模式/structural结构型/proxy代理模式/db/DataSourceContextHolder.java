package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.db;

/**
 * 数据源上下文处理类
 */
public class DataSourceContextHolder {
    
    // 里边存放dataSource的Bean name
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    
    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }
    
    public static String getDBType(){
        return (String) CONTEXT_HOLDER.get();
    }
    
    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
    
}
