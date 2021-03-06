package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

public enum EnumInstance {

    INSTANCE{
        protected void printTest(){
            System.out.println("Thorn Print Test");
        }
    };

    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
