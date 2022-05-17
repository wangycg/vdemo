package work.javac.vdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ViewController {

    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("/getDesc")
    public String getDesc(String id) {
        return "desc";
    }

}
