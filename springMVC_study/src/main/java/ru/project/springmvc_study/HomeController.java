package ru.project.springmvc_study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private AlienDao alienDao;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("addAlien")
    public String addAlien(@RequestParam("id") int id,
                            @RequestParam("name") String name,
                            @RequestParam("tech") String tech,
                           Model model) {

        Alien alien = new Alien();
        alien.setId(id);
        alien.setName(name);
        alien.setTech(tech);
        alienDao.save(alien);

        model.addAttribute("message", "Alien успешно добавлен!");
        return "result";
    }

    @GetMapping("getAliens")
    public String getAliens(Model model) {
        model.addAttribute("aliens", alienDao.getAliens());
        return "showAliens";
    }
}
