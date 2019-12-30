package com.example.demo.designpattern设计模式.behavioral行为型.memento备忘录模式;

public class Test {

    public static void main(String[] args) {
        // 创建快照管理对象
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        // 
        Article article = new Article("如影随形的设计模式A", "手记内容A", "图片A");
        
        // 创建快照
        ArticleMemento articleMemento  = article.saveToMenento();
        
        // 将快照存放到管理者栈中去
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题：" + article.getTitle() + " 内容：" + article.getContent() + " 图片：" + article.getImgs());

        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");
        
        article.setTitle("如影随形的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记内容B");

        System.out.println("修改手记END");

        System.out.println("手记完整信息：" + article);

        // 将快照存放到管理者栈中去
        articleMemento = article.saveToMenento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("如影随形的设计模式C");
        article.setContent("手记内容C");
        article.setImgs("图片C");
        
        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退END");
        System.out.println("手记完整信息：" + article);
        
        
    }
    
}
