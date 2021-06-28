package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------------");

        //TEXT JSON -> Object
        //Object -> TEXT JSON

        //controller request json(text) -> Object
        //request object - > json(text)

        var objectMapper = new ObjectMapper();

        //object -> text
        var user = new User("steave",20,"01010000000");
        var text = objectMapper.writeValueAsString(user);

        System.out.println(text);

        //text -> object
        //object mapper 는 dafault 생성자를 필요로 함
        var objectUSer = objectMapper.readValue(text,User.class);
        System.out.println(objectUSer);
    }

}
