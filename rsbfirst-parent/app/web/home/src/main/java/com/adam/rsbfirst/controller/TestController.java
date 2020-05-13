package com.adam.rsbfirst.controller;

import com.adam.rsbfirst.TestUtil;
import com.adam.rsbfirst.manager.TestManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Package com.adam.rsbfirst.controller
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 01:08
 * @Version 1.0.0
 **/
@Controller
public class TestController {
    @Autowired
    private TestManager testManager;

    @GetMapping("testController")
    @ResponseBody
    private String testController(){
        TestUtil.testUtil();
        testManager.testManager();
        System.out.println("testController");
        return "{}";
    }
}
