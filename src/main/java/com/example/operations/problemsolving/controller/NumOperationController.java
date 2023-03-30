package com.example.operations.problemsolving.controller;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/sum")
    public Long getSum(@RequestBody NumericOperations nOp) {
        return myNumOperation.getSum(nOp.getIntegerList());
    }

    @GetMapping("/fact")
    public Long getFact(@RequestBody NumericOperations nOp) {
        return myNumOperation.getfact(nOp.getIntNumber());
    }

    @GetMapping("/duplicate")
    public Boolean isDuplicate(@RequestBody NumericOperations nOp){
        return myNumOperation.isDuplicate(nOp.getIntegerList());
    }
    @GetMapping("/countduplicate")
    public Map<Integer,Long> getcountDuplicate(@RequestBody NumericOperations nOp){
        return myNumOperation.countDuplicate(nOp.getIntegerList());
    }

    @GetMapping("/minmaxsum")
    public String getMinMaxSum(@RequestBody NumericOperations nOp){
        return myNumOperation.getMinMaxSum(nOp.getIntegerList());
    }

    @GetMapping("/posnegzero")
    public Map<Integer,Long> getPosNegZero(@RequestBody NumericOperations nOp){
        return myNumOperation.getPosNegZer(nOp.getIntegerList());
    }
}
