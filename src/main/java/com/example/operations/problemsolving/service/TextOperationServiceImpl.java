package com.example.operations.problemsolving.service;

import org.springframework.stereotype.Service;

@Service
public class TextOperationServiceImpl implements TextOperationService{

    @Override
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public String piramid(int num) {
        StringBuilder piramid = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            piramid.append(String.valueOf(' ').repeat(num-i));
            piramid.append(String.valueOf('#').repeat(i)+'\n');
        }
        return piramid.toString();
    }
    
}
