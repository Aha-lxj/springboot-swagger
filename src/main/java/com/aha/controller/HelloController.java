package com.aha.controller;

import com.aha.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aha
 * @create 2022-07-23  17:06
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }
    @ApiOperation("狂神的接口")
    @PostMapping("/aha")
    @ResponseBody
    public String aha(@ApiParam("这个名字会被返回")String username){
        return username;
    }

}
