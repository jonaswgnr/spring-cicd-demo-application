package de.jonaswgnr.cicddemo.cicddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UntestedController {

    @RequestMapping("/demo/untested")
    public String index() {
        return "Demo Application for CI/CD Pipeline; I am untested";
    }

}
