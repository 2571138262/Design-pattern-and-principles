package com.example.demo.interfacesegregation接口隔离原则;

public class Dog implements ISwimAnimalAction, IEatAnimalAction{

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
