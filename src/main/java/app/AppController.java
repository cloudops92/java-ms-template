package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AppController {

    @GetMapping("/")
    public String atRoot() {
        return "Welcome to java-ms-template!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello :)!";
    }
}
