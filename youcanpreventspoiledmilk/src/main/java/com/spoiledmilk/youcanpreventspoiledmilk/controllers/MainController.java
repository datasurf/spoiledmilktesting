package com.spoiledmilk.youcanpreventspoiledmilk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "homepage", method = {RequestMethod.GET, RequestMethod.POST})
    public String mainpage(){
        return "homepage";
    }
}
