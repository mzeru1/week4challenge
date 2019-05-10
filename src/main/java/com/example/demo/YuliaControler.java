package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YuliaControler {
    @RequestMapping("/gitHub")
    public String gitHub(){

        return "gitHub";
    }

    @RequestMapping("/programDesign")
    public String programDesign(){
        return "programDesign";
    }

    @RequestMapping("/coreJava")
    public String coreJava(){
        return "coreJava";
    }
}
