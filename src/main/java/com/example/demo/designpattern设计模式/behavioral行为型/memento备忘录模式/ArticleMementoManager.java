package com.example.demo.designpattern设计模式.behavioral行为型.memento备忘录模式;

import java.util.Stack;

/**
 * 手记快照 Memento(纪念品) 管理者
 */
public class ArticleMementoManager {
    
    // 手记快照的常量栈
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    /**
     * 获取手机快照 Memento对象
     * @return
     */
    public ArticleMemento getMemento(){
        // 出栈
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    /**
     * 添加手记快照对象 
     * @param articleMemento
     */
    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
    
}
