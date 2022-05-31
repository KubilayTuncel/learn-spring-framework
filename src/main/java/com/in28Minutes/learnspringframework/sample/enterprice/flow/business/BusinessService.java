package com.in28Minutes.learnspringframework.sample.enterprice.flow.business;

import com.in28Minutes.learnspringframework.sample.enterprice.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{
    @Autowired
    private DataService dataService;
    public long calculatedSum() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}