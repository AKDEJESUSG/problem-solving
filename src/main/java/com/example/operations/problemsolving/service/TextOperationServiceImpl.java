package com.example.operations.problemsolving.service;

import org.springframework.stereotype.Service;

@Service
public class TextOperationServiceImpl implements TextOperationService{

    @Override
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    
}
