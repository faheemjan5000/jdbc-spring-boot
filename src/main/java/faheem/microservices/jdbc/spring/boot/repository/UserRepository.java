package faheem.microservices.jdbc.spring.boot.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllUserNames() {
        log.info("getAllUserNames() method is called...");

        String queryForUserNames = "select username from user";

        List<String> usernames = new ArrayList<>();

        usernames.addAll(jdbcTemplate.queryForList(queryForUserNames,String.class));
       return usernames;
    }
}
