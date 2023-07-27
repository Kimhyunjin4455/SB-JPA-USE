package jpabook.jpashop;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloContoller {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!!");
        return "hello";
    }
}
