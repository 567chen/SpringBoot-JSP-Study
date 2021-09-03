package com.ctw.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author v_taowchen 2021/09/02 17:06
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

}
