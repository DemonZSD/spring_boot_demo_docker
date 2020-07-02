package org.demonzsd.springbootdemo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.demonzsd.common.api.response.SingletonResp;
import org.demonzsd.springbootdemo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value="/")
    public String index(){
        indexService.show();
        Map<String,String> resp = new HashMap<>();
        resp.put("Hello", "Spring-boot");
        Gson gson = new GsonBuilder().create();
        /*
         * the resp will is
         * {
         *   "Hello":"Spring-boot"
         * }
         *
         */
        return gson.toJson(SingletonResp.builder().success("ok", resp));
    }

}
