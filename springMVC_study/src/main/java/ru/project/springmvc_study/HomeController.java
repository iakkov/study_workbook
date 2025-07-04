package ru.project.springmvc_study;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        ModelAndView mv = new ModelAndView("result");
        int sum = a + b;
        mv.addObject("sum", sum);
        return mv;
    }
}
