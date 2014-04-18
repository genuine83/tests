package com.genuine.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dfetisov on 4/19/14.
 */

@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
