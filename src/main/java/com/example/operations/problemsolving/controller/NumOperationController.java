package com.example.operations.problemsolving.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.operations.problemsolving.model.NumericOperations;
import com.example.operations.problemsolving.service.NumOperationService;

@RestController
@RequestMapping("/numeric")
public class NumOperationController {
    
    @Autowired
    private NumOperationService myNumOperation;

    @GetMapping("/fibo")
    public List<Long> getFiboncci(@RequestBody NumericOperations nOp){
        return myNumOperation.getFibo(nOp.getIntNumber());
    }
}
