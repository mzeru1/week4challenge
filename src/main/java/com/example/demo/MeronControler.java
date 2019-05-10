package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeronControler {
    @RequestMapping("/")
    public String home(){
        return "bloghome";
    }
        @RequestMapping("/gitHub")
        public String gitHub() {

            return "gitHub";
        }

        @RequestMapping("/programDesign")
        public String programDesign() {
            return "programDesign";
        }

        @RequestMapping("/coreJava")
        public String coreJava() {
            return "coreJava";
        }

        @RequestMapping("/oop")
        public String oop() {
            return "oop";
        }

        @RequestMapping("/hcb")
        public String hcb() {
            return "hcb";
        }

        @RequestMapping("/jbc")
        public String jbc() {
            return "jbc";
        }

        @RequestMapping("gitHub1")
        public String gitHub1() {
            return "gitHub1";
        }
}
