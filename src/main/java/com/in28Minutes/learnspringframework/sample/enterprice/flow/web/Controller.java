package com.in28Minutes.learnspringframework.sample.enterprice.flow.web;

import com.in28Minutes.learnspringframework.sample.enterprice.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;
    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculatedSum();
    }
}





