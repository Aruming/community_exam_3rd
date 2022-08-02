package com.ll.exam;

import com.ll.exam.controller.ArticleController;

public class Container {
    private static final ArticleController articleController;

    static{
        articleController = new ArticleController();
    }

    public static ArticleController getArticleController(){
        return articleController;
    }
}
