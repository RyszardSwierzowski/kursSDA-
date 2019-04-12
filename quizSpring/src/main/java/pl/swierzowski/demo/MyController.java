package pl.swierzowski.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {


    @GetMapping("/")
    String index(){
        return "index";
    }

    @PostMapping("/quiz")
    String quiz(){
        return "quiz";
    }



}
