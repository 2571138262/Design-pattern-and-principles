package com.example.demo.designpattern设计模式.behavioral行为型.memento备忘录模式;

/**
 * 手记快照 
 */
public class ArticleMemento {

    private String title;
    private String content;
    private String imgs;
    
    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
