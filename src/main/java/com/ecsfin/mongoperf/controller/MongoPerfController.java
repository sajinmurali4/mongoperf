package com.ecsfin.mongoperf.controller;

import com.ecsfin.mongoperf.model.Message;
import com.ecsfin.mongoperf.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class MongoPerfController {

    @Autowired
    MessageRepository repo;

    @PostMapping
    public void postPayment(@RequestBody Message message) {

        //String messageId = message.getMessageId();
        repo.save(message);

    }
}
