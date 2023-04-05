package com.example.operations.problemsolving.service;

import java.util.Map;

public interface TextOperationService {
    
    public String reverse(String text);

    public String piramid(int num);

    public Map<String,Long> countWords(String text);

    public Boolean validPass(String text);
}
