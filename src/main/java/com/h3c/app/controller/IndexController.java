package com.h3c.app.controller;

import com.h3c.app.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value="/")
    public String index(){

        indexService.show();


        return "hello log app";
    }

}
