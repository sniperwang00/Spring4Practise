package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        System.out.println("aaaaaaa");
        return "home";
    }

    @RequestMapping(value="welcome", method=GET)
    public String welcome() {
        System.out.println("welcome");
        return "home";
    }

}
