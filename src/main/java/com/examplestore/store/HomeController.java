package com.examplestore.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.page-size}")
    private int pageSize;

    @RequestMapping("/")
    public String index(){
        String viewName = getViewName();
       // System.out.println(viewName);
        System.out.println("app name: " + appName);
        System.out.println("page size: " + pageSize);
        return viewName;
    }

    @RequestMapping("/viewName")
    private String getViewName() {
        return "index.html";
    }
}
