package faheem.microservices.jdbc.spring.boot.service;

import faheem.microservices.jdbc.spring.boot.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<String> getAllUsernames(){

        log.info("getAllUserNames() in service is called...");
       return userRepository.getAllUserNames();

    }
}
