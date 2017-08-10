package controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Value("${application.version}")
    private String version;
    @Value("${application.basedir}")
    private String basedir;
    @Value("${application.os}")
    private String os;
    @Value("${application.java_home}")
    private String java_home;
    @Value("${application.spring_version}")
    private String spring_version;
    @Value("${application.myFilteredProperty}")
    private String myFilteredProperty;


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("version",version);
        model.addAttribute("basedir",basedir);
        model.addAttribute("os",os);
        model.addAttribute("java_home",java_home);
        model.addAttribute("spring_version",spring_version);
        model.addAttribute("myFilteredProperty",myFilteredProperty);
        return "index";
    }
}
