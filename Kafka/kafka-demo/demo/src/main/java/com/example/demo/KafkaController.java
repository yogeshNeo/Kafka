package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostMapping(path = "/send/{data}")
    public void sendFoo(@PathVariable String data) {
        this.template.send("topic1", data);
    }
}
