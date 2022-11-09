package faheem.microservices.jdbc.spring.boot.controller;

import faheem.microservices.jdbc.spring.boot.repository.UserRepository;
import faheem.microservices.jdbc.spring.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping ("/check")
    public String check(){
        return "i am up!";
    }

    @GetMapping("/usernames")
    public List<String> getAllUserNames(){
        log.info("getAllUserNames() in controller method is called...");
        return userService.getAllUsernames();
    }

}
