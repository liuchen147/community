package com.lc.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuchen
 * @date 2020/1/15 -17:02
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
            return  "hello";
    }

}