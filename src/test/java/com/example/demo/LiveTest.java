package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class}, webEnvironment
        = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class LiveTest {

}