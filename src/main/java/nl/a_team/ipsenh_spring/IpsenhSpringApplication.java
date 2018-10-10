package nl.a_team.ipsenh_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class IpsenhSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpsenhSpringApplication.class, args);
    }
}
