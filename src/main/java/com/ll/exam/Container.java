package com.ll.exam;

import com.ll.exam.controller.ArticleController;

public class Container {
    public static ArticleController getArticleController(){
        return new ArticleController();
    }
}
