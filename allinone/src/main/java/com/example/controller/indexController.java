package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.font.CreatedFontTracker;

/*
在template目录下的所有页面，只可以通过controller来进行跳转
这个需要模板引擎的支持，thymeleaf
 */

@Controller
public class indexController {
    @RequestMapping("/index")
    public String index(Model model)
    {
        model.addAttribute("msg","hello,spring");
        return "test";
    }


}
