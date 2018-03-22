package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Scanner;

@Controller
public class HelloController {
    public HelloController() {
        System.out.print("this is the hello controller you access on " + new Date());
    }

    @RequestMapping("/hello")
    public ModelAndView mymethod() {
        return new ModelAndView("hellopage", "msg", "Hello First Spring");
    }

    @RequestMapping("/hello1")
    public ModelAndView mySecondMethod() {
        return new ModelAndView("hello1page", "msg", getInfo());
    }

    public StringBuilder getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello im jaydip").append("and im too Smart hmmmmm");
        return stringBuilder;
    }

}
