package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }
}
