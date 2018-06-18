package com.guazi.finance.controller;


import com.guazi.finance.service.clear.IClearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounting/clear")
public class ClearController {

    @Autowired
    private IClearService clearService;

    //测试服务调用
    @ResponseBody
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello");
        clearService.clear();
    }
}
