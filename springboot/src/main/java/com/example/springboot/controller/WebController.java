package com.example.springboot.controller;

import com.example.springboot.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function: provide interface to return data
 * Author: Lenny
 * Date: 2024-11-16 11:00 p.m.
 */
@RestController
public class WebController {

    @RequestMapping("/")
    public Result hello(String name) {
        return Result.success(name);
    }
}
