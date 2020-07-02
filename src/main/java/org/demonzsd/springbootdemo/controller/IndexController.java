package org.demonzsd.springbootdemo.controller;

import org.demonzsd.springbootdemo.service.IndexService;
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
        return "Hello SpringBoot";
    }

}
