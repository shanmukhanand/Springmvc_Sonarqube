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
    public ModelAndView helloMethod() {
        return new ModelAndView("hellopage", "msg", "Hello First Spring");
    }

}
