package com.dream.server.controller;

import com.dream.customer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class CehoController {

    @Autowired
    private EchoService cehoService;

    @GetMapping("/hello")
    public String echo(){
        String result = cehoService.echo();
        return "hello word" + result;
    }
}
