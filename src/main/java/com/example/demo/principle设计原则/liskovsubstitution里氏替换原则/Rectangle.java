package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则;

public class Rectangle implements Quadrangle{

    private long length;
    private long width;

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getLength() {
        return 0;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
