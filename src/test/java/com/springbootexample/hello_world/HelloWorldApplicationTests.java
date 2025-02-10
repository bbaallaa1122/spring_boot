package com.springbootexample.hello_world;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class HelloWorldApplicationTests {

    @Test
    void contextLoads() {
        fail("Forcing test failure in GitHub Actions. ");
    }
}
