package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // model에 data를 실어서 view에 넘길 수 있음.
        return "hello"; // 화면 이름(자동으로 뒤에 .html이 붙음)
    }
}
