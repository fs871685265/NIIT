package com.qdu.mybatis.controller;

import com.qdu.mybatis.pojo.B;
import com.qdu.mybatis.service.BService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BController {

    @Resource
    private BService bService;

    @RequestMapping(value = "/b", method = RequestMethod.GET)
    public String B(){

        B b =bService.selBInfo(1);
        System.out.println(b);

        return "/index";
    }
}
