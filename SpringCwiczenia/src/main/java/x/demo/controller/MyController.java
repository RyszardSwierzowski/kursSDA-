package x.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/index")
    String showIndex(){
        return "index";
    }
    @PostMapping("/index")
    String getIndex(){
        return "index2";
    }








}
