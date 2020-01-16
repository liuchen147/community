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
public class IndexController {

    @GetMapping("/")
    public String index(){

            return  "index";
    }

}
