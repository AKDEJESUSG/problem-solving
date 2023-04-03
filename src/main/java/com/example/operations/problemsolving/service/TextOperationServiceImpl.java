package com.example.operations.problemsolving.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Override
    public Map<String, Long> countWords(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        return words.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
    }
    
}
