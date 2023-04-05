package com.example.operations.problemsolving.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.operations.problemsolving.model.TextOperation;
import com.example.operations.problemsolving.service.TextOperationService;


@RestController
@RequestMapping("/text")
public class TextOperationController {
    
    @Autowired
    TextOperationService textOpt;

    @GetMapping("/reverse")
    public String getReverse(@RequestBody TextOperation tO) {
        return textOpt.reverse(tO.getText());
    }

    @GetMapping("/piramid")
    public String getPiramid(@RequestBody TextOperation tO) {
        return textOpt.piramid(tO.getLimit());
    }

    @GetMapping("/countwords")
    public Map<String,Long> getCountWords(@RequestBody TextOperation tO){
        return textOpt.countWords(tO.getText());
    }

    @GetMapping(value="/isvalid")
    public Boolean isValid(@RequestBody TextOperation tO) {
        return textOpt.validPass(tO.getText());
    }
    
}
