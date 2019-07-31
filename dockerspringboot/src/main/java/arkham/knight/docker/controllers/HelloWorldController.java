package arkham.knight.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/hello")
public class HelloWorldController {

    @GetMapping
    public String hello(){
        return "Hello world in a docker";
    }
}
