package programmerzamannow.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Aidil", helloService.hello("Aidil"));
        Assertions.assertEquals("Hello Aidil Adam", helloService.hello("Aidil", "Adam"));
        Assertions.assertEquals("Bye Aidil", helloService.bye("Aidil"));

        helloService.test();
    }
}
