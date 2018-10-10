package nl.a_team.ipsenh_spring.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private TestRepo testRepo;

    @Autowired
    public TestController(TestRepo testRepo){
        this.testRepo = testRepo;
    }

}
