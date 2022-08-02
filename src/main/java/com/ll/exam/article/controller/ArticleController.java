package com.ll.exam.article.controller;

import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;
import com.ll.exam.article.service.ArticleService;

@Controller // ArticleController 가 컨트롤러 이다.
// 아래 ArticleController 클래스는 Controller 이다.
public class ArticleController {
    private ArticleService articleService;
    @GetMapping("/usr/article/list") // /usr/article/list/free 와 같이 관련된 요청을 처리하는 함수

    //showList 는 Get /usr/article/list 으로 요청이 왔을 때 실행 되어야 하는 함수
    public void showList() {

    }
}