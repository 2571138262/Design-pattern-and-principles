package com.example.demo.designpattern设计模式.structural结构型.composite组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录类
 */
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    // 方法1
//    @Override
//    public void print() {
//        System.out.println(this.name);
//
//        for (CatalogComponent catalogComponent : items){
//            if (this.level != null){
//                for (int i = 0; i < this.level; i++) {
//                    System.out.print("  ");
//                }
//            }
//            catalogComponent.print();
//        }
//    }

    // 方法2
    @Override
    public void print() {
        System.out.println(this.name);

        for (CatalogComponent catalogComponent : items){
            if (this instanceof CourseCatalog){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }
}
